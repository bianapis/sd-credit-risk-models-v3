package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsActivityAnalysis;
import org.bian.dto.SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecord
 */
public class SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecord   {
  private SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsActivityAnalysis creditRiskModelsActivityAnalysis = null;

  private SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsPerformanceAnalysis creditRiskModelsPerformanceAnalysis = null;

  private SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get creditRiskModelsActivityAnalysis
   * @return creditRiskModelsActivityAnalysis
  **/

  public SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsActivityAnalysis getCreditRiskModelsActivityAnalysis() {
    return creditRiskModelsActivityAnalysis;
  }

  public void setCreditRiskModelsActivityAnalysis(SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsActivityAnalysis creditRiskModelsActivityAnalysis) {
    this.creditRiskModelsActivityAnalysis = creditRiskModelsActivityAnalysis;
  }


  /**
   * Get creditRiskModelsPerformanceAnalysis
   * @return creditRiskModelsPerformanceAnalysis
  **/

  public SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsPerformanceAnalysis getCreditRiskModelsPerformanceAnalysis() {
    return creditRiskModelsPerformanceAnalysis;
  }

  public void setCreditRiskModelsPerformanceAnalysis(SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordCreditRiskModelsPerformanceAnalysis creditRiskModelsPerformanceAnalysis) {
    this.creditRiskModelsPerformanceAnalysis = creditRiskModelsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCreditRiskModelsRetrieveInputModelCreditRiskModelsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

