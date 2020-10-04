package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsActivityAnalysis;
import org.bian.dto.SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecord
 */
public class SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecord   {
  private SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsActivityAnalysis creditRiskModelsActivityAnalysis = null;

  private SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsPerformanceAnalysis creditRiskModelsPerformanceAnalysis = null;

  private SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get creditRiskModelsActivityAnalysis
   * @return creditRiskModelsActivityAnalysis
  **/

  public SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsActivityAnalysis getCreditRiskModelsActivityAnalysis() {
    return creditRiskModelsActivityAnalysis;
  }

  public void setCreditRiskModelsActivityAnalysis(SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsActivityAnalysis creditRiskModelsActivityAnalysis) {
    this.creditRiskModelsActivityAnalysis = creditRiskModelsActivityAnalysis;
  }


  /**
   * Get creditRiskModelsPerformanceAnalysis
   * @return creditRiskModelsPerformanceAnalysis
  **/

  public SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsPerformanceAnalysis getCreditRiskModelsPerformanceAnalysis() {
    return creditRiskModelsPerformanceAnalysis;
  }

  public void setCreditRiskModelsPerformanceAnalysis(SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsPerformanceAnalysis creditRiskModelsPerformanceAnalysis) {
    this.creditRiskModelsPerformanceAnalysis = creditRiskModelsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCreditRiskModelsRetrieveOutputModelCreditRiskModelsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

