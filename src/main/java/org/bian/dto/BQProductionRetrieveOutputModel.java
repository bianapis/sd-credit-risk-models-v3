package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRetrieveOutputModelProductionInstanceAnalysis;
import org.bian.dto.BQProductionRetrieveOutputModelProductionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveOutputModel
 */
public class BQProductionRetrieveOutputModel   {
  private String productionPreconditions = null;

  private String productionSpecificationSchedule = null;

  private String productionVersionNumber = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private String serviceName = null;

  private String productionRetrieveActionTaskReference = null;

  private Object productionRetrieveActionTaskRecord = null;

  private String productionRetrieveActionResponse = null;

  private BQProductionRetrieveOutputModelProductionInstanceReport productionInstanceReport = null;

  private BQProductionRetrieveOutputModelProductionInstanceAnalysis productionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return productionPreconditions
  **/

  public String getProductionPreconditions() {
    return productionPreconditions;
  }

  public void setProductionPreconditions(String productionPreconditions) {
    this.productionPreconditions = productionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return productionSpecificationSchedule
  **/

  public String getProductionSpecificationSchedule() {
    return productionSpecificationSchedule;
  }

  public void setProductionSpecificationSchedule(String productionSpecificationSchedule) {
    this.productionSpecificationSchedule = productionSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return productionVersionNumber
  **/

  public String getProductionVersionNumber() {
    return productionVersionNumber;
  }

  public void setProductionVersionNumber(String productionVersionNumber) {
    this.productionVersionNumber = productionVersionNumber;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production instance retrieve service call 
   * @return productionRetrieveActionTaskReference
  **/

  public String getProductionRetrieveActionTaskReference() {
    return productionRetrieveActionTaskReference;
  }

  public void setProductionRetrieveActionTaskReference(String productionRetrieveActionTaskReference) {
    this.productionRetrieveActionTaskReference = productionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productionRetrieveActionTaskRecord
  **/

  public Object getProductionRetrieveActionTaskRecord() {
    return productionRetrieveActionTaskRecord;
  }

  public void setProductionRetrieveActionTaskRecord(Object productionRetrieveActionTaskRecord) {
    this.productionRetrieveActionTaskRecord = productionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productionRetrieveActionResponse
  **/

  public String getProductionRetrieveActionResponse() {
    return productionRetrieveActionResponse;
  }

  public void setProductionRetrieveActionResponse(String productionRetrieveActionResponse) {
    this.productionRetrieveActionResponse = productionRetrieveActionResponse;
  }


  /**
   * Get productionInstanceReport
   * @return productionInstanceReport
  **/

  public BQProductionRetrieveOutputModelProductionInstanceReport getProductionInstanceReport() {
    return productionInstanceReport;
  }

  public void setProductionInstanceReport(BQProductionRetrieveOutputModelProductionInstanceReport productionInstanceReport) {
    this.productionInstanceReport = productionInstanceReport;
  }


  /**
   * Get productionInstanceAnalysis
   * @return productionInstanceAnalysis
  **/

  public BQProductionRetrieveOutputModelProductionInstanceAnalysis getProductionInstanceAnalysis() {
    return productionInstanceAnalysis;
  }

  public void setProductionInstanceAnalysis(BQProductionRetrieveOutputModelProductionInstanceAnalysis productionInstanceAnalysis) {
    this.productionInstanceAnalysis = productionInstanceAnalysis;
  }


}

