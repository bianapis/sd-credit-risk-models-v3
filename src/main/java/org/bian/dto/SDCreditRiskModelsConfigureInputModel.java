package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsConfigureInputModel
 */
public class SDCreditRiskModelsConfigureInputModel   {
  private Object creditRiskModelsConfigurationActionTaskRecord = null;

  private String creditRiskModelsServicingSessionReference = null;

  private String creditRiskModelsServiceReference = null;

  private SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecord creditRiskModelsServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return creditRiskModelsConfigurationActionTaskRecord
  **/

  public Object getCreditRiskModelsConfigurationActionTaskRecord() {
    return creditRiskModelsConfigurationActionTaskRecord;
  }

  public void setCreditRiskModelsConfigurationActionTaskRecord(Object creditRiskModelsConfigurationActionTaskRecord) {
    this.creditRiskModelsConfigurationActionTaskRecord = creditRiskModelsConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return creditRiskModelsServicingSessionReference
  **/

  public String getCreditRiskModelsServicingSessionReference() {
    return creditRiskModelsServicingSessionReference;
  }

  public void setCreditRiskModelsServicingSessionReference(String creditRiskModelsServicingSessionReference) {
    this.creditRiskModelsServicingSessionReference = creditRiskModelsServicingSessionReference;
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

  public SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecord getCreditRiskModelsServiceConfigurationRecord() {
    return creditRiskModelsServiceConfigurationRecord;
  }

  public void setCreditRiskModelsServiceConfigurationRecord(SDCreditRiskModelsConfigureInputModelCreditRiskModelsServiceConfigurationRecord creditRiskModelsServiceConfigurationRecord) {
    this.creditRiskModelsServiceConfigurationRecord = creditRiskModelsServiceConfigurationRecord;
  }


}

