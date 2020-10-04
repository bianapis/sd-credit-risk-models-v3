package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsFeedbackOutputModelCreditRiskModelsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsFeedbackOutputModel
 */
public class SDCreditRiskModelsFeedbackOutputModel   {
  private String creditRiskModelsFeedbackActionTaskReference = null;

  private Object creditRiskModelsFeedbackActionTaskRecord = null;

  private SDCreditRiskModelsFeedbackOutputModelCreditRiskModelsFeedbackActionRecord creditRiskModelsFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return creditRiskModelsFeedbackActionTaskReference
  **/

  public String getCreditRiskModelsFeedbackActionTaskReference() {
    return creditRiskModelsFeedbackActionTaskReference;
  }

  public void setCreditRiskModelsFeedbackActionTaskReference(String creditRiskModelsFeedbackActionTaskReference) {
    this.creditRiskModelsFeedbackActionTaskReference = creditRiskModelsFeedbackActionTaskReference;
  }


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

  public SDCreditRiskModelsFeedbackOutputModelCreditRiskModelsFeedbackActionRecord getCreditRiskModelsFeedbackActionRecord() {
    return creditRiskModelsFeedbackActionRecord;
  }

  public void setCreditRiskModelsFeedbackActionRecord(SDCreditRiskModelsFeedbackOutputModelCreditRiskModelsFeedbackActionRecord creditRiskModelsFeedbackActionRecord) {
    this.creditRiskModelsFeedbackActionRecord = creditRiskModelsFeedbackActionRecord;
  }


}

