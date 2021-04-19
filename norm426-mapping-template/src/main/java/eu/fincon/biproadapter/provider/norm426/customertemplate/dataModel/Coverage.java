package eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;


@Component
public class Coverage {


	@JsonProperty("sum_insured_min")
	private int sumInsuredMinimum;

	@JsonProperty("deductible_min")
	private int deductibleMinAmount;

	@JsonProperty("duration_max")
	private String duration;

	@JsonProperty("payment_frequency")
	private String paymentFrequency;

	public int getSumInsuredMinimum() {
		return sumInsuredMinimum;
	}

	public void setSumInsuredMinimum(int sumInsuredMinimum) {
		this.sumInsuredMinimum = sumInsuredMinimum;
	}

	public int getDeductibleMinAmount() {
		return deductibleMinAmount;
	}

	public void setDeductibleMinAmount(int deductibleMinAmount) {
		this.deductibleMinAmount = deductibleMinAmount;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}
	
	
	
	

}
