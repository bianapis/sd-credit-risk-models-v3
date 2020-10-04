package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup
 */
public class SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup   {
  private String creditRiskModelsServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return creditRiskModelsServiceConfigurationParameter
  **/

  public String getCreditRiskModelsServiceConfigurationParameter() {
    return creditRiskModelsServiceConfigurationParameter;
  }

  public void setCreditRiskModelsServiceConfigurationParameter(String creditRiskModelsServiceConfigurationParameter) {
    this.creditRiskModelsServiceConfigurationParameter = creditRiskModelsServiceConfigurationParameter;
  }


}

