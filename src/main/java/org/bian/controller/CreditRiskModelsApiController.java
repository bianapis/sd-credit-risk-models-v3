/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Design;

@BianRestController
public class CreditRiskModelsApiController {

	@Autowired
	CreditRiskModelsApiService service;
	
	@Design.Activate
	public BianResponse<SDCreditRiskModelsActivateOutputModel> activate(@RequestBody BianRequest<SDCreditRiskModelsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("functionalrequirements")
	@Design.Capture
	public BianResponse<BQFunctionalRequirementsCaptureOutputModel> captureFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalRequirementsCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Design.Capture
	public BianResponse<BQProductionCaptureOutputModel> captureProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testing")
	@Design.Capture
	public BianResponse<BQTestingCaptureOutputModel> captureTesting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureTesting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Capture
	public BianResponse<CRCreditRiskModelSpecificationCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditRiskModelSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Configure
	public BianResponse<SDCreditRiskModelsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCreditRiskModelsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Control
	public BianResponse<CRCreditRiskModelSpecificationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditRiskModelSpecificationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Exchange
	public BianResponse<CRCreditRiskModelSpecificationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditRiskModelSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Feedback
	public BianResponse<SDCreditRiskModelsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCreditRiskModelsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Initiate
	public BianResponse<CRCreditRiskModelSpecificationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCreditRiskModelSpecificationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalrequirements")
	@Design.Request
	public BianResponse<BQFunctionalRequirementsRequestOutputModel> requestFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalRequirementsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Design.Request
	public BianResponse<BQProductionRequestOutputModel> requestProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testing")
	@Design.Request
	public BianResponse<BQTestingRequestOutputModel> requestTesting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTesting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Request
	public BianResponse<CRCreditRiskModelSpecificationRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditRiskModelSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalrequirements")
	@Design.Retrieve
	public BianResponse<BQFunctionalRequirementsRetrieveOutputModel> retrieveFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("production")
	@Design.Retrieve
	public BianResponse<BQProductionRetrieveOutputModel> retrieveProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProduction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("testing")
	@Design.Retrieve
	public BianResponse<BQTestingRetrieveOutputModel> retrieveTesting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTesting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Design.Retrieve
	public BianResponse<CRCreditRiskModelSpecificationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Design.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Design.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Design.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Design.RetrieveSD
	public BianResponse<SDCreditRiskModelsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Design.Update
	public BianResponse<CRCreditRiskModelSpecificationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditRiskModelSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalrequirements")
	@Design.Update
	public BianResponse<BQFunctionalRequirementsUpdateOutputModel> updateFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalRequirementsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Design.Update
	public BianResponse<BQProductionUpdateOutputModel> updateProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testing")
	@Design.Update
	public BianResponse<BQTestingUpdateOutputModel> updateTesting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTesting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
