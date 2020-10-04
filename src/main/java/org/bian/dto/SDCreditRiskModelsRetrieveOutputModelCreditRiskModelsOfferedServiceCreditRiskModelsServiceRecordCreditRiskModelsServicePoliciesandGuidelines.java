package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecordCreditRiskModelsServicePoliciesandGuidelines
 */
public class SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsOfferedServiceCreditRiskModelsServiceRecordCreditRiskModelsServicePoliciesandGuidelines   {
  private String creditRiskModelsServiceEligibility = null;

  private String creditRiskModelsServiceIntendedUses = null;

  private String creditRiskModelsServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return creditRiskModelsServiceEligibility
  **/

  public String getCreditRiskModelsServiceEligibility() {
    return creditRiskModelsServiceEligibility;
  }

  public void setCreditRiskModelsServiceEligibility(String creditRiskModelsServiceEligibility) {
    this.creditRiskModelsServiceEligibility = creditRiskModelsServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return creditRiskModelsServiceIntendedUses
  **/

  public String getCreditRiskModelsServiceIntendedUses() {
    return creditRiskModelsServiceIntendedUses;
  }

  public void setCreditRiskModelsServiceIntendedUses(String creditRiskModelsServiceIntendedUses) {
    this.creditRiskModelsServiceIntendedUses = creditRiskModelsServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return creditRiskModelsServicePricingandTerms
  **/

  public String getCreditRiskModelsServicePricingandTerms() {
    return creditRiskModelsServicePricingandTerms;
  }

  public void setCreditRiskModelsServicePricingandTerms(String creditRiskModelsServicePricingandTerms) {
    this.creditRiskModelsServicePricingandTerms = creditRiskModelsServicePricingandTerms;
  }


}

