/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.saydroid.tinyWRAP;

public class DialogEvent extends SipEvent {
  private long swigCPtr;

  public DialogEvent(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.DialogEvent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DialogEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_DialogEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

}
