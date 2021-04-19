package eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Data {



	@JsonProperty("appId")
	public String appId;

	@JsonProperty("correlationId")
	public String correlationId;

	@JsonProperty("broker_data")
	public BrokerData brokerData;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public BrokerData getBrokerData() {
		return brokerData;
	}

	public void setBrokerData(BrokerData brokerData) {
		this.brokerData = brokerData;
	}
	

}
