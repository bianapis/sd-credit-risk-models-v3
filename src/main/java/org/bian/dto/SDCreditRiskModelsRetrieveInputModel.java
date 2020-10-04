package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsRetrieveInputModelCreditRiskModelsOfferedService;
import org.bian.dto.SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsRetrieveInputModel
 */
public class SDCreditRiskModelsRetrieveInputModel   {
  private Object creditRiskModelsRetrieveActionTaskRecord = null;

  private String creditRiskModelsRetrieveActionRequest = null;

  private SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecord creditRiskModelsRetrieveActionRecord = null;

  private SDCreditRiskModelsRetrieveInputModelCreditRiskModelsOfferedService creditRiskModelsOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditRiskModelsRetrieveActionRequest
  **/

  public String getCreditRiskModelsRetrieveActionRequest() {
    return creditRiskModelsRetrieveActionRequest;
  }

  public void setCreditRiskModelsRetrieveActionRequest(String creditRiskModelsRetrieveActionRequest) {
    this.creditRiskModelsRetrieveActionRequest = creditRiskModelsRetrieveActionRequest;
  }


  /**
   * Get creditRiskModelsRetrieveActionRecord
   * @return creditRiskModelsRetrieveActionRecord
  **/

  public SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecord getCreditRiskModelsRetrieveActionRecord() {
    return creditRiskModelsRetrieveActionRecord;
  }

  public void setCreditRiskModelsRetrieveActionRecord(SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecord creditRiskModelsRetrieveActionRecord) {
    this.creditRiskModelsRetrieveActionRecord = creditRiskModelsRetrieveActionRecord;
  }


  /**
   * Get creditRiskModelsOfferedService
   * @return creditRiskModelsOfferedService
  **/

  public SDCreditRiskModelsRetrieveInputModelCreditRiskModelsOfferedService getCreditRiskModelsOfferedService() {
    return creditRiskModelsOfferedService;
  }

  public void setCreditRiskModelsOfferedService(SDCreditRiskModelsRetrieveInputModelCreditRiskModelsOfferedService creditRiskModelsOfferedService) {
    this.creditRiskModelsOfferedService = creditRiskModelsOfferedService;
  }


}

