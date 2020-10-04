package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditRiskModelSpecificationRequestOutputModel
 */
public class CRCreditRiskModelSpecificationRequestOutputModel   {
  private String creditRiskModelSpecificationParameterType = null;

  private String creditRiskModelSpecificationSelectedOption = null;

  private String creditRiskModelSpecificationVersion = null;

  private String creditRiskModelSpecificationStatus = null;

  private String creditRiskModelSpecificationUsageLog = null;

  private String creditRiskModelSpecificationFeedback = null;

  private String creditRiskModelSpecificationRequestActionTaskReference = null;

  private Object creditRiskModelSpecificationRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Risk Model Specification instance request service call 
   * @return creditRiskModelSpecificationRequestActionTaskReference
  **/

  public String getCreditRiskModelSpecificationRequestActionTaskReference() {
    return creditRiskModelSpecificationRequestActionTaskReference;
  }

  public void setCreditRiskModelSpecificationRequestActionTaskReference(String creditRiskModelSpecificationRequestActionTaskReference) {
    this.creditRiskModelSpecificationRequestActionTaskReference = creditRiskModelSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return creditRiskModelSpecificationRequestActionTaskRecord
  **/

  public Object getCreditRiskModelSpecificationRequestActionTaskRecord() {
    return creditRiskModelSpecificationRequestActionTaskRecord;
  }

  public void setCreditRiskModelSpecificationRequestActionTaskRecord(Object creditRiskModelSpecificationRequestActionTaskRecord) {
    this.creditRiskModelSpecificationRequestActionTaskRecord = creditRiskModelSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

