package eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


public class RequestData {
	
	@JsonProperty("Data")
	private List<Data> requestDataList;

	public List<Data> getRequestDataList() {
		return requestDataList;
	}

	public void setRequestDataList(List<Data> requestDataList) {
		this.requestDataList = requestDataList;
	}
	
	

}
