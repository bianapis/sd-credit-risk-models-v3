package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis;
import org.bian.dto.BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveOutputModel
 */
public class BQFunctionalRequirementsRetrieveOutputModel   {
  private String functionalRequirementsPreconditions = null;

  private String functionalRequirementsSpecificationSchedule = null;

  private String functionalRequirementsVersionNumber = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private String functionalRequirementsRetrieveActionTaskReference = null;

  private Object functionalRequirementsRetrieveActionTaskRecord = null;

  private String functionalRequirementsRetrieveActionResponse = null;

  private BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport functionalRequirementsInstanceReport = null;

  private BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis functionalRequirementsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return functionalRequirementsPreconditions
  **/

  public String getFunctionalRequirementsPreconditions() {
    return functionalRequirementsPreconditions;
  }

  public void setFunctionalRequirementsPreconditions(String functionalRequirementsPreconditions) {
    this.functionalRequirementsPreconditions = functionalRequirementsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return functionalRequirementsSpecificationSchedule
  **/

  public String getFunctionalRequirementsSpecificationSchedule() {
    return functionalRequirementsSpecificationSchedule;
  }

  public void setFunctionalRequirementsSpecificationSchedule(String functionalRequirementsSpecificationSchedule) {
    this.functionalRequirementsSpecificationSchedule = functionalRequirementsSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return functionalRequirementsVersionNumber
  **/

  public String getFunctionalRequirementsVersionNumber() {
    return functionalRequirementsVersionNumber;
  }

  public void setFunctionalRequirementsVersionNumber(String functionalRequirementsVersionNumber) {
    this.functionalRequirementsVersionNumber = functionalRequirementsVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Credit Risk Model Specification specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return serviceType
  **/

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return serviceDescription
  **/

  public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return serviceInputsandOuputs
  **/

  public String getServiceInputsandOuputs() {
    return serviceInputsandOuputs;
  }

  public void setServiceInputsandOuputs(String serviceInputsandOuputs) {
    this.serviceInputsandOuputs = serviceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return serviceWorkProduct
  **/

  public String getServiceWorkProduct() {
    return serviceWorkProduct;
  }

  public void setServiceWorkProduct(String serviceWorkProduct) {
    this.serviceWorkProduct = serviceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Requirements instance retrieve service call 
   * @return functionalRequirementsRetrieveActionTaskReference
  **/

  public String getFunctionalRequirementsRetrieveActionTaskReference() {
    return functionalRequirementsRetrieveActionTaskReference;
  }

  public void setFunctionalRequirementsRetrieveActionTaskReference(String functionalRequirementsRetrieveActionTaskReference) {
    this.functionalRequirementsRetrieveActionTaskReference = functionalRequirementsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return functionalRequirementsRetrieveActionTaskRecord
  **/

  public Object getFunctionalRequirementsRetrieveActionTaskRecord() {
    return functionalRequirementsRetrieveActionTaskRecord;
  }

  public void setFunctionalRequirementsRetrieveActionTaskRecord(Object functionalRequirementsRetrieveActionTaskRecord) {
    this.functionalRequirementsRetrieveActionTaskRecord = functionalRequirementsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return functionalRequirementsRetrieveActionResponse
  **/

  public String getFunctionalRequirementsRetrieveActionResponse() {
    return functionalRequirementsRetrieveActionResponse;
  }

  public void setFunctionalRequirementsRetrieveActionResponse(String functionalRequirementsRetrieveActionResponse) {
    this.functionalRequirementsRetrieveActionResponse = functionalRequirementsRetrieveActionResponse;
  }


  /**
   * Get functionalRequirementsInstanceReport
   * @return functionalRequirementsInstanceReport
  **/

  public BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport getFunctionalRequirementsInstanceReport() {
    return functionalRequirementsInstanceReport;
  }

  public void setFunctionalRequirementsInstanceReport(BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport functionalRequirementsInstanceReport) {
    this.functionalRequirementsInstanceReport = functionalRequirementsInstanceReport;
  }


  /**
   * Get functionalRequirementsInstanceAnalysis
   * @return functionalRequirementsInstanceAnalysis
  **/

  public BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis getFunctionalRequirementsInstanceAnalysis() {
    return functionalRequirementsInstanceAnalysis;
  }

  public void setFunctionalRequirementsInstanceAnalysis(BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis functionalRequirementsInstanceAnalysis) {
    this.functionalRequirementsInstanceAnalysis = functionalRequirementsInstanceAnalysis;
  }


}

