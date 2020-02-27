package sprint;

import java.util.List;


public class Address {
	private String housenumber ;
	private String city;
	private String state;
	private String country;
	public  Address(String housenumber ,String city, String state , String country){
	this.setHousenumber(housenumber);
	this.setCity(city);
	this.setState(state);
	this.setCountry(country);
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void  setHousenumber(String housenumber) {
		this.housenumber = housenumber;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}