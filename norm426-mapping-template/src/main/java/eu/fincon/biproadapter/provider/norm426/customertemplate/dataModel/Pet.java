package eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pet {

	
	@JsonProperty("id")
	private int id;
	
	
	@JsonProperty("race")
	private String breed;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
	
	

}
