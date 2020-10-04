package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsRetrieveInputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecord
 */
public class SDCreditRiskModelsRetrieveInputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecord   {
  private String creditRiskModelsServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return creditRiskModelsServiceVersion
  **/

  public String getCreditRiskModelsServiceVersion() {
    return creditRiskModelsServiceVersion;
  }

  public void setCreditRiskModelsServiceVersion(String creditRiskModelsServiceVersion) {
    this.creditRiskModelsServiceVersion = creditRiskModelsServiceVersion;
  }


}

