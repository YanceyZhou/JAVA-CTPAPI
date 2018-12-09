/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcExchangeOptionSelfCloseField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeOptionSelfCloseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOptionSelfCloseField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcExchangeOptionSelfCloseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVolume(int value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_BusinessUnit_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_HedgeFlag_get(swigCPtr, this);
  }

  public void setOptSelfCloseFlag(char value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_OptSelfCloseFlag_set(swigCPtr, this, value);
  }

  public char getOptSelfCloseFlag() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_OptSelfCloseFlag_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_SettlementID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttradeapiJNI.CThostFtdcExchangeOptionSelfCloseField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOptionSelfCloseField() {
    this(thosttradeapiJNI.new_CThostFtdcExchangeOptionSelfCloseField(), true);
  }

}