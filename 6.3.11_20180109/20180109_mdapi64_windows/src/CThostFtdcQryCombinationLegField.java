/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcQryCombinationLegField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryCombinationLegField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryCombinationLegField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcQryCombinationLegField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCombInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcQryCombinationLegField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return thostmduserapiJNI.CThostFtdcQryCombinationLegField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setLegID(int value) {
    thostmduserapiJNI.CThostFtdcQryCombinationLegField_LegID_set(swigCPtr, this, value);
  }

  public int getLegID() {
    return thostmduserapiJNI.CThostFtdcQryCombinationLegField_LegID_get(swigCPtr, this);
  }

  public void setLegInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcQryCombinationLegField_LegInstrumentID_set(swigCPtr, this, value);
  }

  public String getLegInstrumentID() {
    return thostmduserapiJNI.CThostFtdcQryCombinationLegField_LegInstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryCombinationLegField() {
    this(thostmduserapiJNI.new_CThostFtdcQryCombinationLegField(), true);
  }

}
