/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcDRTransferField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcDRTransferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDRTransferField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcDRTransferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOrigDRIdentityID(int value) {
    thostmduserapiJNI.CThostFtdcDRTransferField_OrigDRIdentityID_set(swigCPtr, this, value);
  }

  public int getOrigDRIdentityID() {
    return thostmduserapiJNI.CThostFtdcDRTransferField_OrigDRIdentityID_get(swigCPtr, this);
  }

  public void setDestDRIdentityID(int value) {
    thostmduserapiJNI.CThostFtdcDRTransferField_DestDRIdentityID_set(swigCPtr, this, value);
  }

  public int getDestDRIdentityID() {
    return thostmduserapiJNI.CThostFtdcDRTransferField_DestDRIdentityID_get(swigCPtr, this);
  }

  public void setOrigBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcDRTransferField_OrigBrokerID_set(swigCPtr, this, value);
  }

  public String getOrigBrokerID() {
    return thostmduserapiJNI.CThostFtdcDRTransferField_OrigBrokerID_get(swigCPtr, this);
  }

  public void setDestBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcDRTransferField_DestBrokerID_set(swigCPtr, this, value);
  }

  public String getDestBrokerID() {
    return thostmduserapiJNI.CThostFtdcDRTransferField_DestBrokerID_get(swigCPtr, this);
  }

  public CThostFtdcDRTransferField() {
    this(thostmduserapiJNI.new_CThostFtdcDRTransferField(), true);
  }

}
