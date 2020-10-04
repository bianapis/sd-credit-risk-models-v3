package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription
 */
public class SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceSubscription   {
  private String creditRiskModelsServiceSubscriberReference = null;

  private String creditRiskModelsServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return creditRiskModelsServiceSubscriberReference
  **/

  public String getCreditRiskModelsServiceSubscriberReference() {
    return creditRiskModelsServiceSubscriberReference;
  }

  public void setCreditRiskModelsServiceSubscriberReference(String creditRiskModelsServiceSubscriberReference) {
    this.creditRiskModelsServiceSubscriberReference = creditRiskModelsServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return creditRiskModelsServiceSubscriberAccessProfile
  **/

  public String getCreditRiskModelsServiceSubscriberAccessProfile() {
    return creditRiskModelsServiceSubscriberAccessProfile;
  }

  public void setCreditRiskModelsServiceSubscriberAccessProfile(String creditRiskModelsServiceSubscriberAccessProfile) {
    this.creditRiskModelsServiceSubscriberAccessProfile = creditRiskModelsServiceSubscriberAccessProfile;
  }


}

