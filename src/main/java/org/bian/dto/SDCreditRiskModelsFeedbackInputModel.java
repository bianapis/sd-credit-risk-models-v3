package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsFeedbackInputModelCreditRiskModelsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsFeedbackInputModel
 */
public class SDCreditRiskModelsFeedbackInputModel   {
  private Object creditRiskModelsFeedbackActionTaskRecord = null;

  private SDCreditRiskModelsFeedbackInputModelCreditRiskModelsFeedbackActionRecord creditRiskModelsFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return creditRiskModelsFeedbackActionTaskRecord
  **/

  public Object getCreditRiskModelsFeedbackActionTaskRecord() {
    return creditRiskModelsFeedbackActionTaskRecord;
  }

  public void setCreditRiskModelsFeedbackActionTaskRecord(Object creditRiskModelsFeedbackActionTaskRecord) {
    this.creditRiskModelsFeedbackActionTaskRecord = creditRiskModelsFeedbackActionTaskRecord;
  }


  /**
   * Get creditRiskModelsFeedbackActionRecord
   * @return creditRiskModelsFeedbackActionRecord
  **/

  public SDCreditRiskModelsFeedbackInputModelCreditRiskModelsFeedbackActionRecord getCreditRiskModelsFeedbackActionRecord() {
    return creditRiskModelsFeedbackActionRecord;
  }

  public void setCreditRiskModelsFeedbackActionRecord(SDCreditRiskModelsFeedbackInputModelCreditRiskModelsFeedbackActionRecord creditRiskModelsFeedbackActionRecord) {
    this.creditRiskModelsFeedbackActionRecord = creditRiskModelsFeedbackActionRecord;
  }


}

