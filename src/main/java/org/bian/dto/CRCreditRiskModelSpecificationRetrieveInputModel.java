package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceAnalysis;
import org.bian.dto.CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditRiskModelSpecificationRetrieveInputModel
 */
public class CRCreditRiskModelSpecificationRetrieveInputModel   {
  private Object creditRiskModelSpecificationRetrieveActionTaskRecord = null;

  private String creditRiskModelSpecificationRetrieveActionRequest = null;

  private CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceReportRecord creditRiskModelSpecificationInstanceReportRecord = null;

  private CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceAnalysis creditRiskModelSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditRiskModelSpecificationRetrieveActionTaskRecord
  **/

  public Object getCreditRiskModelSpecificationRetrieveActionTaskRecord() {
    return creditRiskModelSpecificationRetrieveActionTaskRecord;
  }

  public void setCreditRiskModelSpecificationRetrieveActionTaskRecord(Object creditRiskModelSpecificationRetrieveActionTaskRecord) {
    this.creditRiskModelSpecificationRetrieveActionTaskRecord = creditRiskModelSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditRiskModelSpecificationRetrieveActionRequest
  **/

  public String getCreditRiskModelSpecificationRetrieveActionRequest() {
    return creditRiskModelSpecificationRetrieveActionRequest;
  }

  public void setCreditRiskModelSpecificationRetrieveActionRequest(String creditRiskModelSpecificationRetrieveActionRequest) {
    this.creditRiskModelSpecificationRetrieveActionRequest = creditRiskModelSpecificationRetrieveActionRequest;
  }


  /**
   * Get creditRiskModelSpecificationInstanceReportRecord
   * @return creditRiskModelSpecificationInstanceReportRecord
  **/

  public CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceReportRecord getCreditRiskModelSpecificationInstanceReportRecord() {
    return creditRiskModelSpecificationInstanceReportRecord;
  }

  public void setCreditRiskModelSpecificationInstanceReportRecord(CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceReportRecord creditRiskModelSpecificationInstanceReportRecord) {
    this.creditRiskModelSpecificationInstanceReportRecord = creditRiskModelSpecificationInstanceReportRecord;
  }


  /**
   * Get creditRiskModelSpecificationInstanceAnalysis
   * @return creditRiskModelSpecificationInstanceAnalysis
  **/

  public CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceAnalysis getCreditRiskModelSpecificationInstanceAnalysis() {
    return creditRiskModelSpecificationInstanceAnalysis;
  }

  public void setCreditRiskModelSpecificationInstanceAnalysis(CRCreditRiskModelSpecificationRetrieveInputModelCreditRiskModelSpecificationInstanceAnalysis creditRiskModelSpecificationInstanceAnalysis) {
    this.creditRiskModelSpecificationInstanceAnalysis = creditRiskModelSpecificationInstanceAnalysis;
  }


}

