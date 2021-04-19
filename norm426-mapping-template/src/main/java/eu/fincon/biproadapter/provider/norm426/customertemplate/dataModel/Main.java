package eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.fincon.biproadapter.provider.norm426.customertemplate.httpClient.AaasHttpClient;


@Component
public class Main {

	@Autowired
	private AaasHttpClient asClient;

	static List<Data> dataList=new ArrayList<Data>();
	private AaasHttpClient aSHttpClient;


	public String requestJson(RequestData rq)
	{

		// Creating Object of ObjectMapper define in Jakson Api
		ObjectMapper Obj = new ObjectMapper();
		//Obj.enable(SerializationFeature.INDENT_OUTPUT);
		//Obj.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		String jsonStr="";
		String responseJson="";
		try {

			asClient=new AaasHttpClient();
			jsonStr = Obj.writeValueAsString(rq);

			// Displaying JSON String
			responseJson=asClient.sendData(jsonStr);
			System.out.println("$$$$$$: "+jsonStr);

		}

		catch (Exception e) {
			e.printStackTrace();
		}	
		return responseJson;

	}

}
