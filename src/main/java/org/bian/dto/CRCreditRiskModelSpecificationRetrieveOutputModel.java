package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceAnalysis;
import org.bian.dto.CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditRiskModelSpecificationRetrieveOutputModel
 */
public class CRCreditRiskModelSpecificationRetrieveOutputModel   {
  private String creditRiskModelSpecificationParameterType = null;

  private String creditRiskModelSpecificationSelectedOption = null;

  private String creditRiskModelSpecificationDescription = null;

  private String creditRiskModelSpecificationVersion = null;

  private String creditRiskModelSpecificationStatus = null;

  private String creditRiskModelSpecificationUsageLog = null;

  private String creditRiskModelSpecificationFeedback = null;

  private String creditRiskModelSpecificationServiceProviderReference = null;

  private String creditRiskModelSpecificationRetrieveActionTaskReference = null;

  private Object creditRiskModelSpecificationRetrieveActionTaskRecord = null;

  private String creditRiskModelSpecificationRetrieveActionResponse = null;

  private CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceReportRecord creditRiskModelSpecificationInstanceReportRecord = null;

  private CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceAnalysis creditRiskModelSpecificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Credit Risk Model Specification 
   * @return creditRiskModelSpecificationDescription
  **/

  public String getCreditRiskModelSpecificationDescription() {
    return creditRiskModelSpecificationDescription;
  }

  public void setCreditRiskModelSpecificationDescription(String creditRiskModelSpecificationDescription) {
    this.creditRiskModelSpecificationDescription = creditRiskModelSpecificationDescription;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has provided Credit Risk Model Specification 
   * @return creditRiskModelSpecificationServiceProviderReference
  **/

  public String getCreditRiskModelSpecificationServiceProviderReference() {
    return creditRiskModelSpecificationServiceProviderReference;
  }

  public void setCreditRiskModelSpecificationServiceProviderReference(String creditRiskModelSpecificationServiceProviderReference) {
    this.creditRiskModelSpecificationServiceProviderReference = creditRiskModelSpecificationServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Risk Model Specification instance retrieve service call 
   * @return creditRiskModelSpecificationRetrieveActionTaskReference
  **/

  public String getCreditRiskModelSpecificationRetrieveActionTaskReference() {
    return creditRiskModelSpecificationRetrieveActionTaskReference;
  }

  public void setCreditRiskModelSpecificationRetrieveActionTaskReference(String creditRiskModelSpecificationRetrieveActionTaskReference) {
    this.creditRiskModelSpecificationRetrieveActionTaskReference = creditRiskModelSpecificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditRiskModelSpecificationRetrieveActionTaskRecord
  **/

  public Object getCreditRiskModelSpecificationRetrieveActionTaskRecord() {
    return creditRiskModelSpecificationRetrieveActionTaskRecord;
  }

  public void setCreditRiskModelSpecificationRetrieveActionTaskRecord(Object creditRiskModelSpecificationRetrieveActionTaskRecord) {
    this.creditRiskModelSpecificationRetrieveActionTaskRecord = creditRiskModelSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditRiskModelSpecificationRetrieveActionResponse
  **/

  public String getCreditRiskModelSpecificationRetrieveActionResponse() {
    return creditRiskModelSpecificationRetrieveActionResponse;
  }

  public void setCreditRiskModelSpecificationRetrieveActionResponse(String creditRiskModelSpecificationRetrieveActionResponse) {
    this.creditRiskModelSpecificationRetrieveActionResponse = creditRiskModelSpecificationRetrieveActionResponse;
  }


  /**
   * Get creditRiskModelSpecificationInstanceReportRecord
   * @return creditRiskModelSpecificationInstanceReportRecord
  **/

  public CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceReportRecord getCreditRiskModelSpecificationInstanceReportRecord() {
    return creditRiskModelSpecificationInstanceReportRecord;
  }

  public void setCreditRiskModelSpecificationInstanceReportRecord(CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceReportRecord creditRiskModelSpecificationInstanceReportRecord) {
    this.creditRiskModelSpecificationInstanceReportRecord = creditRiskModelSpecificationInstanceReportRecord;
  }


  /**
   * Get creditRiskModelSpecificationInstanceAnalysis
   * @return creditRiskModelSpecificationInstanceAnalysis
  **/

  public CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceAnalysis getCreditRiskModelSpecificationInstanceAnalysis() {
    return creditRiskModelSpecificationInstanceAnalysis;
  }

  public void setCreditRiskModelSpecificationInstanceAnalysis(CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceAnalysis creditRiskModelSpecificationInstanceAnalysis) {
    this.creditRiskModelSpecificationInstanceAnalysis = creditRiskModelSpecificationInstanceAnalysis;
  }


}

