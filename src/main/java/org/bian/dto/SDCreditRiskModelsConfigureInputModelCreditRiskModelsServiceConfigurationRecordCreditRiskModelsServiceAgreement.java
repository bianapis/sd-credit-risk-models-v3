package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement
 */
public class SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecordCreditRiskModelsServiceAgreement   {
  private String creditRiskModelsServiceAgreementReference = null;

  private String creditRiskModelsServiceUserReference = null;

  private String creditRiskModelsServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return creditRiskModelsServiceAgreementReference
  **/

  public String getCreditRiskModelsServiceAgreementReference() {
    return creditRiskModelsServiceAgreementReference;
  }

  public void setCreditRiskModelsServiceAgreementReference(String creditRiskModelsServiceAgreementReference) {
    this.creditRiskModelsServiceAgreementReference = creditRiskModelsServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return creditRiskModelsServiceUserReference
  **/

  public String getCreditRiskModelsServiceUserReference() {
    return creditRiskModelsServiceUserReference;
  }

  public void setCreditRiskModelsServiceUserReference(String creditRiskModelsServiceUserReference) {
    this.creditRiskModelsServiceUserReference = creditRiskModelsServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return creditRiskModelsServiceAgreementTermsandConditions
  **/

  public String getCreditRiskModelsServiceAgreementTermsandConditions() {
    return creditRiskModelsServiceAgreementTermsandConditions;
  }

  public void setCreditRiskModelsServiceAgreementTermsandConditions(String creditRiskModelsServiceAgreementTermsandConditions) {
    this.creditRiskModelsServiceAgreementTermsandConditions = creditRiskModelsServiceAgreementTermsandConditions;
  }


}

