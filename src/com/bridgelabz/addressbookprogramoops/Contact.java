package com.bridgelabz.addressbookprogramoops;

public class Contact {
  private	String firstName;
  private	String lastName;
  private	String address;
  private	String phoneNumber;
  private	String emailID;
  private	String city;
  private	String state;
  private	String zip;
	
	/*
	 *USING GETTER AND SETTER 
	 * SETTER - Assigning the values to variable using  setter method
	 * GETTER - Taking the values from variable using getter method
	 */
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Contact [firstName="+ firstName + ",\n lastName=" + lastName + ", \n address=" + address + ",\n phoneNumber="
				+ phoneNumber + ",\n emailID=" + emailID + ", \ncity=" + city + ",\n state=" + state + ", \nzip=" + zip + "]";
	}
	
	
}
