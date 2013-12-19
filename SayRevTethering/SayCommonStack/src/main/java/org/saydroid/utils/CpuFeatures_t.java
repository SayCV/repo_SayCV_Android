/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.saydroid.utils;

public enum CpuFeatures_t {
  ARMv7(1),
  VFPv3(2),
  NEON(4);

  public final int swigValue() {
    return swigValue;
  }

  public static CpuFeatures_t swigToEnum(int swigValue) {
    CpuFeatures_t[] swigValues = CpuFeatures_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (CpuFeatures_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + CpuFeatures_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private CpuFeatures_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private CpuFeatures_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private CpuFeatures_t(CpuFeatures_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

