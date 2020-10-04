package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecordCreditRiskModelsServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecord
 */
public class SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecord   {
  private String creditRiskModelsServiceType = null;

  private String creditRiskModelsServiceVersion = null;

  private String creditRiskModelsServiceDescription = null;

  private SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecordCreditRiskModelsServicePoliciesandGuidelines creditRiskModelsServicePoliciesandGuidelines = null;

  private String creditRiskModelsServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return creditRiskModelsServiceType
  **/

  public String getCreditRiskModelsServiceType() {
    return creditRiskModelsServiceType;
  }

  public void setCreditRiskModelsServiceType(String creditRiskModelsServiceType) {
    this.creditRiskModelsServiceType = creditRiskModelsServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return creditRiskModelsServiceDescription
  **/

  public String getCreditRiskModelsServiceDescription() {
    return creditRiskModelsServiceDescription;
  }

  public void setCreditRiskModelsServiceDescription(String creditRiskModelsServiceDescription) {
    this.creditRiskModelsServiceDescription = creditRiskModelsServiceDescription;
  }


  /**
   * Get creditRiskModelsServicePoliciesandGuidelines
   * @return creditRiskModelsServicePoliciesandGuidelines
  **/

  public SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecordCreditRiskModelsServicePoliciesandGuidelines getCreditRiskModelsServicePoliciesandGuidelines() {
    return creditRiskModelsServicePoliciesandGuidelines;
  }

  public void setCreditRiskModelsServicePoliciesandGuidelines(SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecordCreditRiskModelsServicePoliciesandGuidelines creditRiskModelsServicePoliciesandGuidelines) {
    this.creditRiskModelsServicePoliciesandGuidelines = creditRiskModelsServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return creditRiskModelsServiceSchedule
  **/

  public String getCreditRiskModelsServiceSchedule() {
    return creditRiskModelsServiceSchedule;
  }

  public void setCreditRiskModelsServiceSchedule(String creditRiskModelsServiceSchedule) {
    this.creditRiskModelsServiceSchedule = creditRiskModelsServiceSchedule;
  }


}

