package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRequestOutputModel
 */
public class BQFunctionalRequirementsRequestOutputModel   {
  private String functionalRequirementsPreconditions = null;

  private String functionalRequirementsSpecificationSchedule = null;

  private String functionalRequirementsVersionNumber = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private String functionalRequirementsRequestActionTaskReference = null;

  private Object functionalRequirementsRequestActionTaskRecord = null;

  private String functionalRequirementsRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Requirements instance request service call 
   * @return functionalRequirementsRequestActionTaskReference
  **/

  public String getFunctionalRequirementsRequestActionTaskReference() {
    return functionalRequirementsRequestActionTaskReference;
  }

  public void setFunctionalRequirementsRequestActionTaskReference(String functionalRequirementsRequestActionTaskReference) {
    this.functionalRequirementsRequestActionTaskReference = functionalRequirementsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return functionalRequirementsRequestActionTaskRecord
  **/

  public Object getFunctionalRequirementsRequestActionTaskRecord() {
    return functionalRequirementsRequestActionTaskRecord;
  }

  public void setFunctionalRequirementsRequestActionTaskRecord(Object functionalRequirementsRequestActionTaskRecord) {
    this.functionalRequirementsRequestActionTaskRecord = functionalRequirementsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Requirements service request record 
   * @return functionalRequirementsRequestRecordReference
  **/

  public String getFunctionalRequirementsRequestRecordReference() {
    return functionalRequirementsRequestRecordReference;
  }

  public void setFunctionalRequirementsRequestRecordReference(String functionalRequirementsRequestRecordReference) {
    this.functionalRequirementsRequestRecordReference = functionalRequirementsRequestRecordReference;
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

