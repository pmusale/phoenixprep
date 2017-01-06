package com.phoenix.usermgmt.helper;

import java.util.Date;

public class UserDTO {
		public Long id;		
		public String address1;		
		public String address2;		
		public boolean adultcheck;		
		public String city;		
		public String country;		
		public String countrycode;		
		public String email;		
		public String firstName;		
		public Date lastmodifieddate;		
		public String lastName;		
		public String state;		
		public int termsofuse_fkidtermsofuse;		
		public boolean termsofuseaccepted;		
		public Date termsofuseaccepteddate;	
		public String zip;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getAddress1() {
			return address1;
		}
		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		public String getAddress2() {
			return address2;
		}
		public void setAddress2(String address2) {
			this.address2 = address2;
		}
		public boolean isAdultcheck() {
			return adultcheck;
		}
		public void setAdultcheck(boolean adultcheck) {
			this.adultcheck = adultcheck;
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
		public String getCountrycode() {
			return countrycode;
		}
		public void setCountrycode(String countrycode) {
			this.countrycode = countrycode;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public Date getLastmodifieddate() {
			return lastmodifieddate;
		}
		public void setLastmodifieddate(Date lastmodifieddate) {
			this.lastmodifieddate = lastmodifieddate;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getTermsofuse_fkidtermsofuse() {
			return termsofuse_fkidtermsofuse;
		}
		public void setTermsofuse_fkidtermsofuse(int termsofuse_fkidtermsofuse) {
			this.termsofuse_fkidtermsofuse = termsofuse_fkidtermsofuse;
		}
		public boolean isTermsofuseaccepted() {
			return termsofuseaccepted;
		}
		public void setTermsofuseaccepted(boolean termsofuseaccepted) {
			this.termsofuseaccepted = termsofuseaccepted;
		}
		public Date getTermsofuseaccepteddate() {
			return termsofuseaccepteddate;
		}
		public void setTermsofuseaccepteddate(Date termsofuseaccepteddate) {
			this.termsofuseaccepteddate = termsofuseaccepteddate;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		
		public UserDTO(){
			
		}
		public UserDTO(Long id, String address1, String address2, boolean adultcheck, String city, String country,
				String countrycode, String email, String firstName, Date lastmodifieddate, String lastName,
				String state, int termsofuse_fkidtermsofuse, boolean termsofuseaccepted, Date termsofuseaccepteddate,
				String zip) {
			super();
			this.id = id;
			this.address1 = address1;
			this.address2 = address2;
			this.adultcheck = adultcheck;
			this.city = city;
			this.country = country;
			this.countrycode = countrycode;
			this.email = email;
			this.firstName = firstName;
			this.lastmodifieddate = lastmodifieddate;
			this.lastName = lastName;
			this.state = state;
			this.termsofuse_fkidtermsofuse = termsofuse_fkidtermsofuse;
			this.termsofuseaccepted = termsofuseaccepted;
			this.termsofuseaccepteddate = termsofuseaccepteddate;
			this.zip = zip;
		}
		@Override
		public String toString() {
			return "UserDTO [id=" + id + ", address1=" + address1 + ", address2=" + address2 + ", adultcheck="
					+ adultcheck + ", city=" + city + ", country=" + country + ", countrycode=" + countrycode
					+ ", email=" + email + ", firstName=" + firstName + ", lastmodifieddate=" + lastmodifieddate
					+ ", lastName=" + lastName + ", state=" + state + ", termsofuse_fkidtermsofuse="
					+ termsofuse_fkidtermsofuse + ", termsofuseaccepted=" + termsofuseaccepted
					+ ", termsofuseaccepteddate=" + termsofuseaccepteddate + ", zip=" + zip + "]";
		}		

}
