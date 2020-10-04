package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsConfigureOutputModelCreditRiskModelsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsConfigureOutputModel
 */
public class SDCreditRiskModelsConfigureOutputModel   {
  private String creditRiskModelsConfigurationActionTaskReference = null;

  private Object creditRiskModelsConfigurationActionTaskRecord = null;

  private SDCreditRiskModelsConfigureOutputModelCreditRiskModelsServiceConfigurationRecord creditRiskModelsServiceConfigurationRecord = null;

  private String creditRiskModelsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return creditRiskModelsConfigurationActionTaskReference
  **/

  public String getCreditRiskModelsConfigurationActionTaskReference() {
    return creditRiskModelsConfigurationActionTaskReference;
  }

  public void setCreditRiskModelsConfigurationActionTaskReference(String creditRiskModelsConfigurationActionTaskReference) {
    this.creditRiskModelsConfigurationActionTaskReference = creditRiskModelsConfigurationActionTaskReference;
  }


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
   * Get creditRiskModelsServiceConfigurationRecord
   * @return creditRiskModelsServiceConfigurationRecord
  **/

  public SDCreditRiskModelsConfigureOutputModelCreditRiskModelsServiceConfigurationRecord getCreditRiskModelsServiceConfigurationRecord() {
    return creditRiskModelsServiceConfigurationRecord;
  }

  public void setCreditRiskModelsServiceConfigurationRecord(SDCreditRiskModelsConfigureOutputModelCreditRiskModelsServiceConfigurationRecord creditRiskModelsServiceConfigurationRecord) {
    this.creditRiskModelsServiceConfigurationRecord = creditRiskModelsServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return creditRiskModelsServicingSessionStatus
  **/

  public String getCreditRiskModelsServicingSessionStatus() {
    return creditRiskModelsServicingSessionStatus;
  }

  public void setCreditRiskModelsServicingSessionStatus(String creditRiskModelsServicingSessionStatus) {
    this.creditRiskModelsServicingSessionStatus = creditRiskModelsServicingSessionStatus;
  }


}

