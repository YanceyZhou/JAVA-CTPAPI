/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcInputQuoteActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInputQuoteActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputQuoteActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcInputQuoteActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_InvestorID_get(swigCPtr, this);
  }

  public void setQuoteActionRef(int value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_QuoteActionRef_set(swigCPtr, this, value);
  }

  public int getQuoteActionRef() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_QuoteActionRef_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_QuoteRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_QuoteSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmduserapiJNI.CThostFtdcInputQuoteActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmduserapiJNI.CThostFtdcInputQuoteActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputQuoteActionField() {
    this(thostmduserapiJNI.new_CThostFtdcInputQuoteActionField(), true);
  }

}
