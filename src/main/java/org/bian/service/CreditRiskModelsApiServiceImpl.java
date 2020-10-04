/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CreditRiskModelsApiServiceImpl implements CreditRiskModelsApiService {

	public SDCreditRiskModelsActivateOutputModel activate(SDCreditRiskModelsActivateInputModel request){
		return JsonReader.read("activate-SDCreditRiskModelsActivateOutputModel.json",new TypeReference<SDCreditRiskModelsActivateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsCaptureOutputModel captureFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsCaptureInputModel request){
		return JsonReader.read("capture-BQFunctionalRequirementsCaptureOutputModel.json",new TypeReference<BQFunctionalRequirementsCaptureOutputModel>(){});
	}
	
	public BQProductionCaptureOutputModel captureProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionCaptureInputModel request){
		return JsonReader.read("capture-BQProductionCaptureOutputModel.json",new TypeReference<BQProductionCaptureOutputModel>(){});
	}
	
	public BQTestingCaptureOutputModel captureTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingCaptureInputModel request){
		return JsonReader.read("capture-BQTestingCaptureOutputModel.json",new TypeReference<BQTestingCaptureOutputModel>(){});
	}
	
	public CRCreditRiskModelSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationCaptureInputModel request){
		return JsonReader.read("capture-CRCreditRiskModelSpecificationCaptureOutputModel.json",new TypeReference<CRCreditRiskModelSpecificationCaptureOutputModel>(){});
	}
	
	public SDCreditRiskModelsConfigureOutputModel configure(String sdReferenceId, SDCreditRiskModelsConfigureInputModel request){
		return JsonReader.read("configure-SDCreditRiskModelsConfigureOutputModel.json",new TypeReference<SDCreditRiskModelsConfigureOutputModel>(){});
	}
	
	public CRCreditRiskModelSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationControlInputModel request){
		return JsonReader.read("control-CRCreditRiskModelSpecificationControlOutputModel.json",new TypeReference<CRCreditRiskModelSpecificationControlOutputModel>(){});
	}
	
	public CRCreditRiskModelSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-CRCreditRiskModelSpecificationExchangeOutputModel.json",new TypeReference<CRCreditRiskModelSpecificationExchangeOutputModel>(){});
	}
	
	public SDCreditRiskModelsFeedbackOutputModel feedback(String sdReferenceId, SDCreditRiskModelsFeedbackInputModel request){
		return JsonReader.read("feedback-SDCreditRiskModelsFeedbackOutputModel.json",new TypeReference<SDCreditRiskModelsFeedbackOutputModel>(){});
	}
	
	public CRCreditRiskModelSpecificationInitiateOutputModel initiate(String sdReferenceId, CRCreditRiskModelSpecificationInitiateInputModel request){
		return JsonReader.read("initiate-CRCreditRiskModelSpecificationInitiateOutputModel.json",new TypeReference<CRCreditRiskModelSpecificationInitiateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsRequestOutputModel requestFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsRequestInputModel request){
		return JsonReader.read("request-BQFunctionalRequirementsRequestOutputModel.json",new TypeReference<BQFunctionalRequirementsRequestOutputModel>(){});
	}
	
	public BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request){
		return JsonReader.read("request-BQProductionRequestOutputModel.json",new TypeReference<BQProductionRequestOutputModel>(){});
	}
	
	public BQTestingRequestOutputModel requestTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingRequestInputModel request){
		return JsonReader.read("request-BQTestingRequestOutputModel.json",new TypeReference<BQTestingRequestOutputModel>(){});
	}
	
	public CRCreditRiskModelSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationRequestInputModel request){
		return JsonReader.read("request-CRCreditRiskModelSpecificationRequestOutputModel.json",new TypeReference<CRCreditRiskModelSpecificationRequestOutputModel>(){});
	}
	
	public BQFunctionalRequirementsRetrieveOutputModel retrieveFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFunctionalRequirementsRetrieveOutputModel.json",new TypeReference<BQFunctionalRequirementsRetrieveOutputModel>(){});
	}
	
	public BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionRetrieveOutputModel.json",new TypeReference<BQProductionRetrieveOutputModel>(){});
	}
	
	public BQTestingRetrieveOutputModel retrieveTesting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTestingRetrieveOutputModel.json",new TypeReference<BQTestingRetrieveOutputModel>(){});
	}
	
	public CRCreditRiskModelSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCreditRiskModelSpecificationRetrieveOutputModel.json",new TypeReference<CRCreditRiskModelSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCreditRiskModelsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCreditRiskModelsRetrieveOutputModel.json",new TypeReference<SDCreditRiskModelsRetrieveOutputModel>(){});
	}
	
	public CRCreditRiskModelSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditRiskModelSpecificationUpdateInputModel request){
		return JsonReader.read("update-CRCreditRiskModelSpecificationUpdateOutputModel.json",new TypeReference<CRCreditRiskModelSpecificationUpdateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsUpdateOutputModel updateFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsUpdateInputModel request){
		return JsonReader.read("update-BQFunctionalRequirementsUpdateOutputModel.json",new TypeReference<BQFunctionalRequirementsUpdateOutputModel>(){});
	}
	
	public BQProductionUpdateOutputModel updateProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionUpdateInputModel request){
		return JsonReader.read("update-BQProductionUpdateOutputModel.json",new TypeReference<BQProductionUpdateOutputModel>(){});
	}
	
	public BQTestingUpdateOutputModel updateTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingUpdateInputModel request){
		return JsonReader.read("update-BQTestingUpdateOutputModel.json",new TypeReference<BQTestingUpdateOutputModel>(){});
	}
	
}
