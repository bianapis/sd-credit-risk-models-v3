/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CreditRiskModelsApiService {

	SDCreditRiskModelsActivateOutputModel activate(SDCreditRiskModelsActivateInputModel request);
	
	BQFunctionalRequirementsCaptureOutputModel captureFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsCaptureInputModel request);
	
	BQProductionCaptureOutputModel captureProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionCaptureInputModel request);
	
	BQTestingCaptureOutputModel captureTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingCaptureInputModel request);
	
	CRCreditRiskModelSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationCaptureInputModel request);
	
	SDCreditRiskModelsConfigureOutputModel configure(String sdReferenceId, SDCreditRiskModelsConfigureInputModel request);
	
	CRCreditRiskModelSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationControlInputModel request);
	
	CRCreditRiskModelSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationExchangeInputModel request);
	
	SDCreditRiskModelsFeedbackOutputModel feedback(String sdReferenceId, SDCreditRiskModelsFeedbackInputModel request);
	
	CRCreditRiskModelSpecificationInitiateOutputModel initiate(String sdReferenceId, CRCreditRiskModelSpecificationInitiateInputModel request);
	
	BQFunctionalRequirementsRequestOutputModel requestFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsRequestInputModel request);
	
	BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request);
	
	BQTestingRequestOutputModel requestTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingRequestInputModel request);
	
	CRCreditRiskModelSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationRequestInputModel request);
	
	BQFunctionalRequirementsRetrieveOutputModel retrieveFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTestingRetrieveOutputModel retrieveTesting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCreditRiskModelSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCreditRiskModelsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCreditRiskModelSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationUpdateInputModel request);
	
	BQFunctionalRequirementsUpdateOutputModel updateFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsUpdateInputModel request);
	
	BQProductionUpdateOutputModel updateProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionUpdateInputModel request);
	
	BQTestingUpdateOutputModel updateTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingUpdateInputModel request);
	
}
