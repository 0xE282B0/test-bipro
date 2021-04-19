package eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class BrokerData {
	
	@JsonProperty("product")
	public Product product;
	
	@JsonProperty("risk_parameters")
	public RiskParameter riskParameters;
	
	@JsonProperty("coverage")
	public Coverage coverage;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public RiskParameter getRiskParameters() {
		return riskParameters;
	}

	public void setRiskParameters(RiskParameter riskParameters) {
		this.riskParameters = riskParameters;
	}

	public Coverage getCoverage() {
		return coverage;
	}

	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}

	
	
	
}
 