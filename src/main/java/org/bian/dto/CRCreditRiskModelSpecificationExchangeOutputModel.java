package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditRiskModelSpecificationExchangeOutputModel
 */
public class CRCreditRiskModelSpecificationExchangeOutputModel   {
  private String creditRiskModelSpecificationParameterType = null;

  private String creditRiskModelSpecificationSelectedOption = null;

  private String creditRiskModelSpecificationVersion = null;

  private String creditRiskModelSpecificationStatus = null;

  private String creditRiskModelSpecificationUsageLog = null;

  private String creditRiskModelSpecificationFeedback = null;

  private String creditRiskModelSpecificationExchangeActionTaskReference = null;

  private Object creditRiskModelSpecificationExchangeActionTaskRecord = null;

  private String creditRiskModelSpecificationExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between designs according to the type of business services and/or aspect within Credit Risk Model Specification . Eg Product Design, Campaign Design, Risk Model Design etc.  
   * @return creditRiskModelSpecificationParameterType
  **/

  public String getCreditRiskModelSpecificationParameterType() {
    return creditRiskModelSpecificationParameterType;
  }

  public void setCreditRiskModelSpecificationParameterType(String creditRiskModelSpecificationParameterType) {
    this.creditRiskModelSpecificationParameterType = creditRiskModelSpecificationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of design 
   * @return creditRiskModelSpecificationSelectedOption
  **/

  public String getCreditRiskModelSpecificationSelectedOption() {
    return creditRiskModelSpecificationSelectedOption;
  }

  public void setCreditRiskModelSpecificationSelectedOption(String creditRiskModelSpecificationSelectedOption) {
    this.creditRiskModelSpecificationSelectedOption = creditRiskModelSpecificationSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version of Credit Risk Model Specification 
   * @return creditRiskModelSpecificationVersion
  **/

  public String getCreditRiskModelSpecificationVersion() {
    return creditRiskModelSpecificationVersion;
  }

  public void setCreditRiskModelSpecificationVersion(String creditRiskModelSpecificationVersion) {
    this.creditRiskModelSpecificationVersion = creditRiskModelSpecificationVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Credit Risk Model Specification 
   * @return creditRiskModelSpecificationStatus
  **/

  public String getCreditRiskModelSpecificationStatus() {
    return creditRiskModelSpecificationStatus;
  }

  public void setCreditRiskModelSpecificationStatus(String creditRiskModelSpecificationStatus) {
    this.creditRiskModelSpecificationStatus = creditRiskModelSpecificationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Credit Risk Model Specification 
   * @return creditRiskModelSpecificationUsageLog
  **/

  public String getCreditRiskModelSpecificationUsageLog() {
    return creditRiskModelSpecificationUsageLog;
  }

  public void setCreditRiskModelSpecificationUsageLog(String creditRiskModelSpecificationUsageLog) {
    this.creditRiskModelSpecificationUsageLog = creditRiskModelSpecificationUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Information about reactions to a design which is used as a basis for improvement for the Credit Risk Model Specification. 
   * @return creditRiskModelSpecificationFeedback
  **/

  public String getCreditRiskModelSpecificationFeedback() {
    return creditRiskModelSpecificationFeedback;
  }

  public void setCreditRiskModelSpecificationFeedback(String creditRiskModelSpecificationFeedback) {
    this.creditRiskModelSpecificationFeedback = creditRiskModelSpecificationFeedback;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Risk Model Specification instance exchange service call 
   * @return creditRiskModelSpecificationExchangeActionTaskReference
  **/

  public String getCreditRiskModelSpecificationExchangeActionTaskReference() {
    return creditRiskModelSpecificationExchangeActionTaskReference;
  }

  public void setCreditRiskModelSpecificationExchangeActionTaskReference(String creditRiskModelSpecificationExchangeActionTaskReference) {
    this.creditRiskModelSpecificationExchangeActionTaskReference = creditRiskModelSpecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return creditRiskModelSpecificationExchangeActionTaskRecord
  **/

  public Object getCreditRiskModelSpecificationExchangeActionTaskRecord() {
    return creditRiskModelSpecificationExchangeActionTaskRecord;
  }

  public void setCreditRiskModelSpecificationExchangeActionTaskRecord(Object creditRiskModelSpecificationExchangeActionTaskRecord) {
    this.creditRiskModelSpecificationExchangeActionTaskRecord = creditRiskModelSpecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return creditRiskModelSpecificationExchangeActionResponse
  **/

  public String getCreditRiskModelSpecificationExchangeActionResponse() {
    return creditRiskModelSpecificationExchangeActionResponse;
  }

  public void setCreditRiskModelSpecificationExchangeActionResponse(String creditRiskModelSpecificationExchangeActionResponse) {
    this.creditRiskModelSpecificationExchangeActionResponse = creditRiskModelSpecificationExchangeActionResponse;
  }


}

