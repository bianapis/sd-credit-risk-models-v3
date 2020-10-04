package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceAnalysis
 */
public class CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceAnalysis   {
  private String creditRiskModelSpecificationInstanceAnalysisData = null;

  private String creditRiskModelSpecificationInstanceAnalysisReportType = null;

  private Object creditRiskModelSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditRiskModelSpecificationInstanceAnalysisData
  **/

  public String getCreditRiskModelSpecificationInstanceAnalysisData() {
    return creditRiskModelSpecificationInstanceAnalysisData;
  }

  public void setCreditRiskModelSpecificationInstanceAnalysisData(String creditRiskModelSpecificationInstanceAnalysisData) {
    this.creditRiskModelSpecificationInstanceAnalysisData = creditRiskModelSpecificationInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditRiskModelSpecificationInstanceAnalysisReport
  **/

  public Object getCreditRiskModelSpecificationInstanceAnalysisReport() {
    return creditRiskModelSpecificationInstanceAnalysisReport;
  }

  public void setCreditRiskModelSpecificationInstanceAnalysisReport(Object creditRiskModelSpecificationInstanceAnalysisReport) {
    this.creditRiskModelSpecificationInstanceAnalysisReport = creditRiskModelSpecificationInstanceAnalysisReport;
  }


}

