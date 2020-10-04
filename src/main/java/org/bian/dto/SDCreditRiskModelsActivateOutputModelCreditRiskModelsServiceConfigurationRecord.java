package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup;
import org.bian.dto.SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement;
import org.bian.dto.SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecord
 */
public class SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecord   {
  private String creditRiskModelsServiceConfigurationSettingReference = null;

  private String creditRiskModelsServiceConfigurationSettingDescription = null;

  private SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup creditRiskModelsServiceConfigurationSetup = null;

  private SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription creditRiskModelsServiceSubscription = null;

  private SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement creditRiskModelsServiceAgreement = null;

  private String creditRiskModelsServiceStatus = null;


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

  public SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup getCreditRiskModelsServiceConfigurationSetup() {
    return creditRiskModelsServiceConfigurationSetup;
  }

  public void setCreditRiskModelsServiceConfigurationSetup(SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceConfigurationSetup creditRiskModelsServiceConfigurationSetup) {
    this.creditRiskModelsServiceConfigurationSetup = creditRiskModelsServiceConfigurationSetup;
  }


  /**
   * Get creditRiskModelsServiceSubscription
   * @return creditRiskModelsServiceSubscription
  **/

  public SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription getCreditRiskModelsServiceSubscription() {
    return creditRiskModelsServiceSubscription;
  }

  public void setCreditRiskModelsServiceSubscription(SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription creditRiskModelsServiceSubscription) {
    this.creditRiskModelsServiceSubscription = creditRiskModelsServiceSubscription;
  }


  /**
   * Get creditRiskModelsServiceAgreement
   * @return creditRiskModelsServiceAgreement
  **/

  public SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement getCreditRiskModelsServiceAgreement() {
    return creditRiskModelsServiceAgreement;
  }

  public void setCreditRiskModelsServiceAgreement(SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement creditRiskModelsServiceAgreement) {
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

