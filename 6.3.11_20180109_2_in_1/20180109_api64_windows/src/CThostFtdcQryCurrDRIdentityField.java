/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcQryCurrDRIdentityField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryCurrDRIdentityField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryCurrDRIdentityField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcQryCurrDRIdentityField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDRIdentityID(int value) {
    thosttraderapiJNI.CThostFtdcQryCurrDRIdentityField_DRIdentityID_set(swigCPtr, this, value);
  }

  public int getDRIdentityID() {
    return thosttraderapiJNI.CThostFtdcQryCurrDRIdentityField_DRIdentityID_get(swigCPtr, this);
  }

  public CThostFtdcQryCurrDRIdentityField() {
    this(thosttraderapiJNI.new_CThostFtdcQryCurrDRIdentityField(), true);
  }

}
