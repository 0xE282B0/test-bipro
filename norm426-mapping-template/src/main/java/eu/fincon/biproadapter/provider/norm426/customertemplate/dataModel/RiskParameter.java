package eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RiskParameter {
	
	@JsonProperty("number_of_dogs")
	private int numberOfPets;
	
	@JsonProperty("dogs")
	private List<Pet> pet;

	public int getNumberOfPets() {
		return numberOfPets;
	}

	public void setNumberOfPets(int numberOfPets) {
		this.numberOfPets = numberOfPets;
	}

	public List<Pet> getPet() {
		return pet;
	}

	public void setPet(List<Pet> pet) {
		this.pet = pet;
	}
	
	
	

}
