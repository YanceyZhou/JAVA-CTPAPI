/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcForQuoteField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcForQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcForQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setForQuoteRef(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_ForQuoteRef_set(swigCPtr, this, value);
  }

  public String getForQuoteRef() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_ForQuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_UserID_get(swigCPtr, this);
  }

  public void setForQuoteLocalID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_ForQuoteLocalID_set(swigCPtr, this, value);
  }

  public String getForQuoteLocalID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_ForQuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setForQuoteStatus(char value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_ForQuoteStatus_set(swigCPtr, this, value);
  }

  public char getForQuoteStatus() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_ForQuoteStatus_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_SessionID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerForQutoSeq(int value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_BrokerForQutoSeq_set(swigCPtr, this, value);
  }

  public int getBrokerForQutoSeq() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_BrokerForQutoSeq_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmduserapiJNI.CThostFtdcForQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmduserapiJNI.CThostFtdcForQuoteField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteField() {
    this(thostmduserapiJNI.new_CThostFtdcForQuoteField(), true);
  }

}