package com.simplecodeexamples.struts.form;

import org.apache.struts.action.ActionForm;

public class AddressForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	
	private String continent;
	private String country;
	
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
