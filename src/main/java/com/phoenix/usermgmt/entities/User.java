package com.phoenix.usermgmt.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.phoenix.usermgmt.helper.CustomJsonDateDeserializer;
import com.phoenix.usermgmt.helper.CustomJsonDateSerializer;;

/**
 * Users entity
 *
 * @author prashant
 *
 */
@XmlRootElement
@Entity
@Table(name="users", schema = "phoenixschema" )
public class User implements Serializable {

	private static final long serialVersionUID = -12678L;

	/** User id */
	@Id
	@Basic(optional = false)
	@Column(name = "idusers")
	@SequenceGenerator(name="global_id_sequence", sequenceName="phoenixschema.global_id_sequence",schema = "phoenixschema", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="global_id_sequence")
	private Long id;

		@Column(name = "address1")
		private String address1;
		
		@Column(name = "address2")
		private String address2;
		
		@Column(name = "adultcheck")
		private boolean adultcheck;
		
		@Column(name = "city")
		private String city;
		
		@Column(name = "country")
		private String country;
		
		@Column(name = "countrycode")
		private String countrycode;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "firstname")
		private String firstName;
		
		@Column(name = "lastmodifieddate")
		@JsonSerialize(using = CustomJsonDateSerializer.class)
		@JsonDeserialize(using = CustomJsonDateDeserializer.class)	
		private Date lastmodifieddate;
		
		@Column(name = "lastname")
		private String lastName;
		
		@Column(name = "state")
		private String state;
		
		@Column(name = "termsofuse_fkidtermsofuse")
		private int termsofuse_fkidtermsofuse;
		
		@Column(name = "termsofuseaccepted")
		private boolean termsofuseaccepted;
		
		@Column(name = "termsofuseaccepteddate")
		@JsonSerialize(using = CustomJsonDateSerializer.class)
		@JsonDeserialize(using = CustomJsonDateDeserializer.class)
		private Date termsofuseaccepteddate;
		
		@Column(name = "zip")
		private String zip;
	

	public User() {
	}


	
	public User(String address1, String address2, boolean adultcheck, String city, String country,
			String countrycode, String email, String firstname, Date lastmodifieddate, String lastname, String state,
			int termsofuse_fkidtermsofuse, boolean termsofuseaccepted, Date termsofuseaccepteddate, String zip) {
		this.address1 = address1;
		this.address2 = address2;
		this.adultcheck = adultcheck;
		this.city = city;
		this.country = country;
		this.countrycode = countrycode;
		this.email = email;
		this.firstName = firstname;
		this.lastmodifieddate = lastmodifieddate;
		this.lastName = lastname;
		this.state = state;
		this.termsofuse_fkidtermsofuse = termsofuse_fkidtermsofuse;
		this.termsofuseaccepted = termsofuseaccepted;
		this.termsofuseaccepteddate = termsofuseaccepteddate;
		this.zip = zip;
	}

	public User(Long idusers, String address1, String address2, boolean adultcheck, String city, String country,
			String countrycode, String email, String firstname, Date lastmodifieddate, String lastname, String state,
			int termsofuse_fkidtermsofuse, boolean termsofuseaccepted, Date termsofuseaccepteddate, String zip) {
		this.id = idusers;
		this.address1 = address1;
		this.address2 = address2;
		this.adultcheck = adultcheck;
		this.city = city;
		this.country = country;
		this.countrycode = countrycode;
		this.email = email;
		this.firstName = firstname;
		this.lastmodifieddate = lastmodifieddate;
		this.lastName = lastname;
		this.state = state;
		this.termsofuse_fkidtermsofuse = termsofuse_fkidtermsofuse;
		this.termsofuseaccepted = termsofuseaccepted;
		this.termsofuseaccepteddate = termsofuseaccepteddate;
		this.zip = zip;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the adultcheck
	 */
	public boolean isAdultcheck() {
		return adultcheck;
	}

	/**
	 * @param adultcheck the adultcheck to set
	 */
	public void setAdultcheck(boolean adultcheck) {
		this.adultcheck = adultcheck;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the countrycode
	 */
	public String getCountrycode() {
		return countrycode;
	}

	/**
	 * @param countrycode the countrycode to set
	 */
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstName;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	/**
	 * @return the lastmodifieddate
	 */
	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}

	/**
	 * @param lastmodifieddate the lastmodifieddate to set
	 */
	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastName;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the termsofuse_fkidtermsofuse
	 */
	public int getTermsofuse_fkidtermsofuse() {
		return termsofuse_fkidtermsofuse;
	}

	/**
	 * @param termsofuse_fkidtermsofuse the termsofuse_fkidtermsofuse to set
	 */
	public void setTermsofuse_fkidtermsofuse(int termsofuse_fkidtermsofuse) {
		this.termsofuse_fkidtermsofuse = termsofuse_fkidtermsofuse;
	}

	/**
	 * @return the termsofuseaccepted
	 */
	public boolean isTermsofuseaccepted() {
		return termsofuseaccepted;
	}

	/**
	 * @param termsofuseaccepted the termsofuseaccepted to set
	 */
	public void setTermsofuseaccepted(boolean termsofuseaccepted) {
		this.termsofuseaccepted = termsofuseaccepted;
	}

	/**
	 * @return the termsofuseaccepteddate
	 */
	public Date getTermsofuseaccepteddate() {
		return termsofuseaccepteddate;
	}

	/**
	 * @param termsofuseaccepteddate the termsofuseaccepteddate to set
	 */
	public void setTermsofuseaccepteddate(Date termsofuseaccepteddate) {
		this.termsofuseaccepteddate = termsofuseaccepteddate;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	/**
	 * @returns Firtname and lastname in string format
	 */
	
	 @Override
	    public String toString() {
	        return String.format(
	                "Customer[id=%d, firstName='%s', lastName='%s']",
	                id, firstName, lastName);
	    }



}
