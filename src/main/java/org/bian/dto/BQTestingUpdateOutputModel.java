package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateOutputModel
 */
public class BQTestingUpdateOutputModel   {
  private String testingPreconditions = null;

  private String testingSpecificationSchedule = null;

  private String testingVersionNumber = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private String serviceName = null;

  private String testingUpdateActionTaskReference = null;

  private Object testingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return testingPreconditions
  **/

  public String getTestingPreconditions() {
    return testingPreconditions;
  }

  public void setTestingPreconditions(String testingPreconditions) {
    this.testingPreconditions = testingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return testingSpecificationSchedule
  **/

  public String getTestingSpecificationSchedule() {
    return testingSpecificationSchedule;
  }

  public void setTestingSpecificationSchedule(String testingSpecificationSchedule) {
    this.testingSpecificationSchedule = testingSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return testingVersionNumber
  **/

  public String getTestingVersionNumber() {
    return testingVersionNumber;
  }

  public void setTestingVersionNumber(String testingVersionNumber) {
    this.testingVersionNumber = testingVersionNumber;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return serviceName
  **/

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return testingUpdateActionTaskReference
  **/

  public String getTestingUpdateActionTaskReference() {
    return testingUpdateActionTaskReference;
  }

  public void setTestingUpdateActionTaskReference(String testingUpdateActionTaskReference) {
    this.testingUpdateActionTaskReference = testingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return testingUpdateActionTaskRecord
  **/

  public Object getTestingUpdateActionTaskRecord() {
    return testingUpdateActionTaskRecord;
  }

  public void setTestingUpdateActionTaskRecord(Object testingUpdateActionTaskRecord) {
    this.testingUpdateActionTaskRecord = testingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

