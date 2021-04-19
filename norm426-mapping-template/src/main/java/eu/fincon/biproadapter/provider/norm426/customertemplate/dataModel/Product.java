package eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("other_feature")
	private String otherFeature;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOtherFeature() {
		return otherFeature;
	}

	public void setOtherFeature(String otherFeature) {
		this.otherFeature = otherFeature;
	}
	
	

}
