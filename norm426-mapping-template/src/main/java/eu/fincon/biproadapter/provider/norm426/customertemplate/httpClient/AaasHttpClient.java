package eu.fincon.biproadapter.provider.norm426.customertemplate.httpClient;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AaasHttpClient {


	public String sendData(String requestData) {
		String reponseJson="";
		try {

			//WebClient client = WebClient.create("http://0.0.0.0:5000/tariff");
			System.out.println("Request Data: §§§§ ["+requestData+"]");
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<String> requestBody = new HttpEntity<>(requestData, headers);
			String result = restTemplate.postForObject("http://0.0.0.0:5000/tariff", requestBody, String.class);
			System.out.println("§§§§ Response From Python Project "+result);
			//  client.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
			// client.post(requestData); Response reponse=client.get();
			//System.out.println("$$$$ Response is"+reponse);
			reponseJson= result;

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return reponseJson;

	}
}