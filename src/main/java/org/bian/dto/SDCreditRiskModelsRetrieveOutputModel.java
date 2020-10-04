package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedService;
import org.bian.dto.SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsRetrieveOutputModel
 */
public class SDCreditRiskModelsRetrieveOutputModel   {
  private String creditRiskModelsRetrieveActionTaskReference = null;

  private Object creditRiskModelsRetrieveActionTaskRecord = null;

  private String creditRiskModelsRetrieveActionResponse = null;

  private SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecord creditRiskModelsRetrieveActionRecord = null;

  private SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedService creditRiskModelsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return creditRiskModelsRetrieveActionTaskReference
  **/

  public String getCreditRiskModelsRetrieveActionTaskReference() {
    return creditRiskModelsRetrieveActionTaskReference;
  }

  public void setCreditRiskModelsRetrieveActionTaskReference(String creditRiskModelsRetrieveActionTaskReference) {
    this.creditRiskModelsRetrieveActionTaskReference = creditRiskModelsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditRiskModelsRetrieveActionTaskRecord
  **/

  public Object getCreditRiskModelsRetrieveActionTaskRecord() {
    return creditRiskModelsRetrieveActionTaskRecord;
  }

  public void setCreditRiskModelsRetrieveActionTaskRecord(Object creditRiskModelsRetrieveActionTaskRecord) {
    this.creditRiskModelsRetrieveActionTaskRecord = creditRiskModelsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditRiskModelsRetrieveActionResponse
  **/

  public String getCreditRiskModelsRetrieveActionResponse() {
    return creditRiskModelsRetrieveActionResponse;
  }

  public void setCreditRiskModelsRetrieveActionResponse(String creditRiskModelsRetrieveActionResponse) {
    this.creditRiskModelsRetrieveActionResponse = creditRiskModelsRetrieveActionResponse;
  }


  /**
   * Get creditRiskModelsRetrieveActionRecord
   * @return creditRiskModelsRetrieveActionRecord
  **/

  public SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecord getCreditRiskModelsRetrieveActionRecord() {
    return creditRiskModelsRetrieveActionRecord;
  }

  public void setCreditRiskModelsRetrieveActionRecord(SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecord creditRiskModelsRetrieveActionRecord) {
    this.creditRiskModelsRetrieveActionRecord = creditRiskModelsRetrieveActionRecord;
  }


  /**
   * Get creditRiskModelsOfferedService
   * @return creditRiskModelsOfferedService
  **/

  public SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedService getCreditRiskModelsOfferedService() {
    return creditRiskModelsOfferedService;
  }

  public void setCreditRiskModelsOfferedService(SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedService creditRiskModelsOfferedService) {
    this.creditRiskModelsOfferedService = creditRiskModelsOfferedService;
  }


}

