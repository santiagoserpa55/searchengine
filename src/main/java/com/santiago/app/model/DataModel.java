package com.santiago.app.model;

public class DataModel {

	private String subscriptionDate; // date
	private String customerId; // integer or long
	private String firstName;
	private String lastName;
	private String company;
	private String city;
	private String country;
	private String email;

	public DataModel(String subscriptionDate, String customerId, String firstName, String lastName, String company,
			String city, String country, String email) {
		super();
		this.subscriptionDate = subscriptionDate;
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.city = city;
		this.country = country;
		this.email = email;
	}

	public String getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(String subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
