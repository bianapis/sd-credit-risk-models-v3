package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceReportRecord
 */
public class CRCreditRiskModelSpecificationRetrieveOutputModelCreditRiskModelSpecificationInstanceReportRecord   {
  private String creditRiskModelSpecificationInstanceReportData = null;

  private String creditRiskModelSpecificationInstanceReportType = null;

  private Object creditRiskModelSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditRiskModelSpecificationInstanceReportData
  **/

  public String getCreditRiskModelSpecificationInstanceReportData() {
    return creditRiskModelSpecificationInstanceReportData;
  }

  public void setCreditRiskModelSpecificationInstanceReportData(String creditRiskModelSpecificationInstanceReportData) {
    this.creditRiskModelSpecificationInstanceReportData = creditRiskModelSpecificationInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditRiskModelSpecificationInstanceReport
  **/

  public Object getCreditRiskModelSpecificationInstanceReport() {
    return creditRiskModelSpecificationInstanceReport;
  }

  public void setCreditRiskModelSpecificationInstanceReport(Object creditRiskModelSpecificationInstanceReport) {
    this.creditRiskModelSpecificationInstanceReport = creditRiskModelSpecificationInstanceReport;
  }


}

