package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement;
import org.bian.dto.SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup;
import org.bian.dto.SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecord
 */
public class SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecord   {
  private String creditRiskModelsServiceConfigurationSettingReference = null;

  private String creditRiskModelsServiceConfigurationSettingType = null;

  private SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup creditRiskModelsServiceConfigurationSetup = null;

  private SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription creditRiskModelsServiceSubscription = null;

  private SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement creditRiskModelsServiceAgreement = null;


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

  public SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup getCreditRiskModelsServiceConfigurationSetup() {
    return creditRiskModelsServiceConfigurationSetup;
  }

  public void setCreditRiskModelsServiceConfigurationSetup(SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup creditRiskModelsServiceConfigurationSetup) {
    this.creditRiskModelsServiceConfigurationSetup = creditRiskModelsServiceConfigurationSetup;
  }


  /**
   * Get creditRiskModelsServiceSubscription
   * @return creditRiskModelsServiceSubscription
  **/

  public SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription getCreditRiskModelsServiceSubscription() {
    return creditRiskModelsServiceSubscription;
  }

  public void setCreditRiskModelsServiceSubscription(SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription creditRiskModelsServiceSubscription) {
    this.creditRiskModelsServiceSubscription = creditRiskModelsServiceSubscription;
  }


  /**
   * Get creditRiskModelsServiceAgreement
   * @return creditRiskModelsServiceAgreement
  **/

  public SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement getCreditRiskModelsServiceAgreement() {
    return creditRiskModelsServiceAgreement;
  }

  public void setCreditRiskModelsServiceAgreement(SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement creditRiskModelsServiceAgreement) {
    this.creditRiskModelsServiceAgreement = creditRiskModelsServiceAgreement;
  }


}

