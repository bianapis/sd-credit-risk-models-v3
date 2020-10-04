package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsActivateInputModel
 */
public class SDCreditRiskModelsActivateInputModel   {
  private Object creditRiskModelsActivationActionTaskRecord = null;

  private String creditRiskModelsCenterReference = null;

  private String creditRiskModelsServiceReference = null;

  private SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecord creditRiskModelsServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return creditRiskModelsActivationActionTaskRecord
  **/

  public Object getCreditRiskModelsActivationActionTaskRecord() {
    return creditRiskModelsActivationActionTaskRecord;
  }

  public void setCreditRiskModelsActivationActionTaskRecord(Object creditRiskModelsActivationActionTaskRecord) {
    this.creditRiskModelsActivationActionTaskRecord = creditRiskModelsActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return creditRiskModelsCenterReference
  **/

  public String getCreditRiskModelsCenterReference() {
    return creditRiskModelsCenterReference;
  }

  public void setCreditRiskModelsCenterReference(String creditRiskModelsCenterReference) {
    this.creditRiskModelsCenterReference = creditRiskModelsCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return creditRiskModelsServiceReference
  **/

  public String getCreditRiskModelsServiceReference() {
    return creditRiskModelsServiceReference;
  }

  public void setCreditRiskModelsServiceReference(String creditRiskModelsServiceReference) {
    this.creditRiskModelsServiceReference = creditRiskModelsServiceReference;
  }


  /**
   * Get creditRiskModelsServiceConfigurationRecord
   * @return creditRiskModelsServiceConfigurationRecord
  **/

  public SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecord getCreditRiskModelsServiceConfigurationRecord() {
    return creditRiskModelsServiceConfigurationRecord;
  }

  public void setCreditRiskModelsServiceConfigurationRecord(SDCreditRiskModelsActivateInputModelCreditRiskModelsServiceConfigurationRecord creditRiskModelsServiceConfigurationRecord) {
    this.creditRiskModelsServiceConfigurationRecord = creditRiskModelsServiceConfigurationRecord;
  }


}

