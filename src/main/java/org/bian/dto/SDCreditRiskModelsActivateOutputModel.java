package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCreditRiskModelsActivateOutputModel
 */
public class SDCreditRiskModelsActivateOutputModel   {
  private String creditRiskModelsActivationActionTaskReference = null;

  private Object creditRiskModelsActivationActionTaskRecord = null;

  private String creditRiskModelsServicingSessionReference = null;

  private Object creditRiskModelsServicingSessionRecord = null;

  private SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecord creditRiskModelsServiceConfigurationRecord = null;

  private String creditRiskModelsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return creditRiskModelsActivationActionTaskReference
  **/

  public String getCreditRiskModelsActivationActionTaskReference() {
    return creditRiskModelsActivationActionTaskReference;
  }

  public void setCreditRiskModelsActivationActionTaskReference(String creditRiskModelsActivationActionTaskReference) {
    this.creditRiskModelsActivationActionTaskReference = creditRiskModelsActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return creditRiskModelsServicingSessionRecord
  **/

  public Object getCreditRiskModelsServicingSessionRecord() {
    return creditRiskModelsServicingSessionRecord;
  }

  public void setCreditRiskModelsServicingSessionRecord(Object creditRiskModelsServicingSessionRecord) {
    this.creditRiskModelsServicingSessionRecord = creditRiskModelsServicingSessionRecord;
  }


  /**
   * Get creditRiskModelsServiceConfigurationRecord
   * @return creditRiskModelsServiceConfigurationRecord
  **/

  public SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecord getCreditRiskModelsServiceConfigurationRecord() {
    return creditRiskModelsServiceConfigurationRecord;
  }

  public void setCreditRiskModelsServiceConfigurationRecord(SDCreditRiskModelsActivateOutputModelCreditRiskModelsServiceConfigurationRecord creditRiskModelsServiceConfigurationRecord) {
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

