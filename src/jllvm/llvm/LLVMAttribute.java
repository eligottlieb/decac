/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class LLVMAttribute {
  public final static LLVMAttribute LLVMZExtAttribute = new LLVMAttribute("LLVMZExtAttribute", CoreJNI.LLVMZExtAttribute_get());
  public final static LLVMAttribute LLVMSExtAttribute = new LLVMAttribute("LLVMSExtAttribute", CoreJNI.LLVMSExtAttribute_get());
  public final static LLVMAttribute LLVMNoReturnAttribute = new LLVMAttribute("LLVMNoReturnAttribute", CoreJNI.LLVMNoReturnAttribute_get());
  public final static LLVMAttribute LLVMInRegAttribute = new LLVMAttribute("LLVMInRegAttribute", CoreJNI.LLVMInRegAttribute_get());
  public final static LLVMAttribute LLVMStructRetAttribute = new LLVMAttribute("LLVMStructRetAttribute", CoreJNI.LLVMStructRetAttribute_get());
  public final static LLVMAttribute LLVMNoUnwindAttribute = new LLVMAttribute("LLVMNoUnwindAttribute", CoreJNI.LLVMNoUnwindAttribute_get());
  public final static LLVMAttribute LLVMNoAliasAttribute = new LLVMAttribute("LLVMNoAliasAttribute", CoreJNI.LLVMNoAliasAttribute_get());
  public final static LLVMAttribute LLVMByValAttribute = new LLVMAttribute("LLVMByValAttribute", CoreJNI.LLVMByValAttribute_get());
  public final static LLVMAttribute LLVMNestAttribute = new LLVMAttribute("LLVMNestAttribute", CoreJNI.LLVMNestAttribute_get());
  public final static LLVMAttribute LLVMReadNoneAttribute = new LLVMAttribute("LLVMReadNoneAttribute", CoreJNI.LLVMReadNoneAttribute_get());
  public final static LLVMAttribute LLVMReadOnlyAttribute = new LLVMAttribute("LLVMReadOnlyAttribute", CoreJNI.LLVMReadOnlyAttribute_get());
  public final static LLVMAttribute LLVMNoInlineAttribute = new LLVMAttribute("LLVMNoInlineAttribute", CoreJNI.LLVMNoInlineAttribute_get());
  public final static LLVMAttribute LLVMAlwaysInlineAttribute = new LLVMAttribute("LLVMAlwaysInlineAttribute", CoreJNI.LLVMAlwaysInlineAttribute_get());
  public final static LLVMAttribute LLVMOptimizeForSizeAttribute = new LLVMAttribute("LLVMOptimizeForSizeAttribute", CoreJNI.LLVMOptimizeForSizeAttribute_get());
  public final static LLVMAttribute LLVMStackProtectAttribute = new LLVMAttribute("LLVMStackProtectAttribute", CoreJNI.LLVMStackProtectAttribute_get());
  public final static LLVMAttribute LLVMStackProtectReqAttribute = new LLVMAttribute("LLVMStackProtectReqAttribute", CoreJNI.LLVMStackProtectReqAttribute_get());
  public final static LLVMAttribute LLVMAlignment = new LLVMAttribute("LLVMAlignment", CoreJNI.LLVMAlignment_get());
  public final static LLVMAttribute LLVMNoCaptureAttribute = new LLVMAttribute("LLVMNoCaptureAttribute", CoreJNI.LLVMNoCaptureAttribute_get());
  public final static LLVMAttribute LLVMNoRedZoneAttribute = new LLVMAttribute("LLVMNoRedZoneAttribute", CoreJNI.LLVMNoRedZoneAttribute_get());
  public final static LLVMAttribute LLVMNoImplicitFloatAttribute = new LLVMAttribute("LLVMNoImplicitFloatAttribute", CoreJNI.LLVMNoImplicitFloatAttribute_get());
  public final static LLVMAttribute LLVMNakedAttribute = new LLVMAttribute("LLVMNakedAttribute", CoreJNI.LLVMNakedAttribute_get());
  public final static LLVMAttribute LLVMInlineHintAttribute = new LLVMAttribute("LLVMInlineHintAttribute", CoreJNI.LLVMInlineHintAttribute_get());
  public final static LLVMAttribute LLVMStackAlignment = new LLVMAttribute("LLVMStackAlignment", CoreJNI.LLVMStackAlignment_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LLVMAttribute swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LLVMAttribute.class + " with value " + swigValue);
  }

  private LLVMAttribute(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LLVMAttribute(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LLVMAttribute(String swigName, LLVMAttribute swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LLVMAttribute[] swigValues = { LLVMZExtAttribute, LLVMSExtAttribute, LLVMNoReturnAttribute, LLVMInRegAttribute, LLVMStructRetAttribute, LLVMNoUnwindAttribute, LLVMNoAliasAttribute, LLVMByValAttribute, LLVMNestAttribute, LLVMReadNoneAttribute, LLVMReadOnlyAttribute, LLVMNoInlineAttribute, LLVMAlwaysInlineAttribute, LLVMOptimizeForSizeAttribute, LLVMStackProtectAttribute, LLVMStackProtectReqAttribute, LLVMAlignment, LLVMNoCaptureAttribute, LLVMNoRedZoneAttribute, LLVMNoImplicitFloatAttribute, LLVMNakedAttribute, LLVMInlineHintAttribute, LLVMStackAlignment };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

