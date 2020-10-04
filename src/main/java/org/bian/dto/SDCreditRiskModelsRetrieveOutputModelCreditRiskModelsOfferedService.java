package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedService
 */
public class SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedService   {
  private String creditRiskModelsServiceReference = null;

  private SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecord creditRiskModelsServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return creditRiskModelsServiceReference
  **/

  public String getCreditRiskModelsServiceReference() {
    return creditRiskModelsServiceReference;
  }

  public void setCreditRiskModelsServiceReference(String creditRiskModelsServiceReference) {
    this.creditRiskModelsServiceReference = creditRiskModelsServiceReference;
  }


  /**
   * Get creditRiskModelsServiceRecord
   * @return creditRiskModelsServiceRecord
  **/

  public SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecord getCreditRiskModelsServiceRecord() {
    return creditRiskModelsServiceRecord;
  }

  public void setCreditRiskModelsServiceRecord(SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecord creditRiskModelsServiceRecord) {
    this.creditRiskModelsServiceRecord = creditRiskModelsServiceRecord;
  }


}

