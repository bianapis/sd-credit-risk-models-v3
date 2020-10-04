package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecord
 */
public class SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecord   {
  private String creditRiskModelsServiceConfigurationSettingReference = null;

  private String creditRiskModelsServiceConfigurationSettingType = null;

  private SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup creditRiskModelsServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return creditRiskModelsServiceConfigurationSettingReference
  **/

  public String getCreditRiskModelsServiceConfigurationSettingReference() {
    return creditRiskModelsServiceConfigurationSettingReference;
  }

  public void setCreditRiskModelsServiceConfigurationSettingReference(String creditRiskModelsServiceConfigurationSettingReference) {
    this.creditRiskModelsServiceConfigurationSettingReference = creditRiskModelsServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return creditRiskModelsServiceConfigurationSettingType
  **/

  public String getCreditRiskModelsServiceConfigurationSettingType() {
    return creditRiskModelsServiceConfigurationSettingType;
  }

  public void setCreditRiskModelsServiceConfigurationSettingType(String creditRiskModelsServiceConfigurationSettingType) {
    this.creditRiskModelsServiceConfigurationSettingType = creditRiskModelsServiceConfigurationSettingType;
  }


  /**
   * Get creditRiskModelsServiceConfigurationSetup
   * @return creditRiskModelsServiceConfigurationSetup
  **/

  public SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup getCreditRiskModelsServiceConfigurationSetup() {
    return creditRiskModelsServiceConfigurationSetup;
  }

  public void setCreditRiskModelsServiceConfigurationSetup(SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup creditRiskModelsServiceConfigurationSetup) {
    this.creditRiskModelsServiceConfigurationSetup = creditRiskModelsServiceConfigurationSetup;
  }


}

