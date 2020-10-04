package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup
 */
public class SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup   {
  private String creditRiskModelsServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return creditRiskModelsServiceConfigurationParameter
  **/

  public String getCreditRiskModelsServiceConfigurationParameter() {
    return creditRiskModelsServiceConfigurationParameter;
  }

  public void setCreditRiskModelsServiceConfigurationParameter(String creditRiskModelsServiceConfigurationParameter) {
    this.creditRiskModelsServiceConfigurationParameter = creditRiskModelsServiceConfigurationParameter;
  }


}

