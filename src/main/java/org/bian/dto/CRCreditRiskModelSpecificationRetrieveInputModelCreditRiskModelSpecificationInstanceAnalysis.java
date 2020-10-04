package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceAnalysis
 */
public class CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceAnalysis   {
  private String creditRiskModelSpecificationInstanceAnalysisReference = null;

  private String creditRiskModelSpecificationInstanceAnalysisReportType = null;

  private String creditRiskModelSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return creditRiskModelSpecificationInstanceAnalysisReference
  **/

  public String getCreditRiskModelSpecificationInstanceAnalysisReference() {
    return creditRiskModelSpecificationInstanceAnalysisReference;
  }

  public void setCreditRiskModelSpecificationInstanceAnalysisReference(String creditRiskModelSpecificationInstanceAnalysisReference) {
    this.creditRiskModelSpecificationInstanceAnalysisReference = creditRiskModelSpecificationInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditRiskModelSpecificationInstanceAnalysisReportType
  **/

  public String getCreditRiskModelSpecificationInstanceAnalysisReportType() {
    return creditRiskModelSpecificationInstanceAnalysisReportType;
  }

  public void setCreditRiskModelSpecificationInstanceAnalysisReportType(String creditRiskModelSpecificationInstanceAnalysisReportType) {
    this.creditRiskModelSpecificationInstanceAnalysisReportType = creditRiskModelSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditRiskModelSpecificationInstanceAnalysisParameters
  **/

  public String getCreditRiskModelSpecificationInstanceAnalysisParameters() {
    return creditRiskModelSpecificationInstanceAnalysisParameters;
  }

  public void setCreditRiskModelSpecificationInstanceAnalysisParameters(String creditRiskModelSpecificationInstanceAnalysisParameters) {
    this.creditRiskModelSpecificationInstanceAnalysisParameters = creditRiskModelSpecificationInstanceAnalysisParameters;
  }


}

