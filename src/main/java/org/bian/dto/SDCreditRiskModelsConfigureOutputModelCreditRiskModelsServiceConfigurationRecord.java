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
 * SDCreditRiskModelsConfigureOutputModelCreditRiskModelsServiceConfigurationRecord
 */
public class SDCreditRiskModelsConfigureOutputModelCreditRiskModelsServiceConfigurationRecord   {
  private String creditRiskModelsServiceConfigurationSettingDescription = null;

  private SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup creditRiskModelsServiceConfigurationSetup = null;

  private SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription creditRiskModelsServiceSubscription = null;

  private SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement creditRiskModelsServiceAgreement = null;

  private String creditRiskModelsServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return creditRiskModelsServiceConfigurationSettingDescription
  **/

  public String getCreditRiskModelsServiceConfigurationSettingDescription() {
    return creditRiskModelsServiceConfigurationSettingDescription;
  }

  public void setCreditRiskModelsServiceConfigurationSettingDescription(String creditRiskModelsServiceConfigurationSettingDescription) {
    this.creditRiskModelsServiceConfigurationSettingDescription = creditRiskModelsServiceConfigurationSettingDescription;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return creditRiskModelsServiceStatus
  **/

  public String getCreditRiskModelsServiceStatus() {
    return creditRiskModelsServiceStatus;
  }

  public void setCreditRiskModelsServiceStatus(String creditRiskModelsServiceStatus) {
    this.creditRiskModelsServiceStatus = creditRiskModelsServiceStatus;
  }


}

