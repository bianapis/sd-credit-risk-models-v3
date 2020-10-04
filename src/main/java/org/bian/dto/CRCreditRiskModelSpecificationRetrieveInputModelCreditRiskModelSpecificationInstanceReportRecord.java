package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceReportRecord
 */
public class CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceReportRecord   {
  private String creditRiskModelSpecificationInstanceReportReference = null;

  private String creditRiskModelSpecificationInstanceReportType = null;

  private String creditRiskModelSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditRiskModelSpecificationInstanceReportReference
  **/

  public String getCreditRiskModelSpecificationInstanceReportReference() {
    return creditRiskModelSpecificationInstanceReportReference;
  }

  public void setCreditRiskModelSpecificationInstanceReportReference(String creditRiskModelSpecificationInstanceReportReference) {
    this.creditRiskModelSpecificationInstanceReportReference = creditRiskModelSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditRiskModelSpecificationInstanceReportType
  **/

  public String getCreditRiskModelSpecificationInstanceReportType() {
    return creditRiskModelSpecificationInstanceReportType;
  }

  public void setCreditRiskModelSpecificationInstanceReportType(String creditRiskModelSpecificationInstanceReportType) {
    this.creditRiskModelSpecificationInstanceReportType = creditRiskModelSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditRiskModelSpecificationInstanceReportParameters
  **/

  public String getCreditRiskModelSpecificationInstanceReportParameters() {
    return creditRiskModelSpecificationInstanceReportParameters;
  }

  public void setCreditRiskModelSpecificationInstanceReportParameters(String creditRiskModelSpecificationInstanceReportParameters) {
    this.creditRiskModelSpecificationInstanceReportParameters = creditRiskModelSpecificationInstanceReportParameters;
  }


}

