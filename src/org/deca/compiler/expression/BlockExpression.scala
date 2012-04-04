package org.deca.compiler.expression

import org.jllvm.LLVMValue
import org.jllvm.LLVMBasicBlock
import org.jllvm.LLVMFunction
import org.jllvm.LLVMInstructionBuilder
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import org.deca.compiler.definition._
import org.deca.compiler.signature._

class BlockExpression(val steps: List[Expression]) extends Expression {
  expType = steps.last.expType
  expEffect = EffectPair(new EffectVariable(false),new EffectVariable(false))
  override val children = steps
  
  override def constrain(scs: SignatureConstraints): Unit =
    for(step <- steps) {
      scs.push(new SubsumptionConstraint(step.expEffect.positive,expEffect.positive))
      scs.push(new SubsumptionConstraint(step.expEffect.negative,expEffect.negative))
    }
  override def check(scs: SignatureConstraints): Unit = assert(expEffect.safe(PureEffect))
  override def substitute(sub: SignatureSubstitution): Unit = {
    for(step <- steps)
      step.substitute(sub)
    expType = sub.solve(expType).asInstanceOf[MonoType]
    expEffect = EffectPair(sub.solve[MonoEffect](expEffect.positive),sub.solve[MonoEffect](expEffect.negative))
  }
  override def specialize(spec: SignatureSubstitution,specScope: Scope): Expression =
    new BlockExpression(steps.map(_.specialize(spec,specScope)))
  override def compile(builder: LLVMInstructionBuilder,scope: Scope,instantiation: Module): LLVMValue = 
    steps.map(_.compile(builder,scope,instantiation)).last
}
