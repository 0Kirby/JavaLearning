package javaclass;

public class Address {
	private String country;
	private String province;
	private String city;
	private String street;
	private String code;
	Address(){
		
	}
	Address(String country,String province,String city,String street,String code){
		this.country=country;
		this.province=province;
		this.city=city;
		this.street=street;
		this.code=code;
	}
	public void setCountry(String country){
		this.country=country;
	}
	public String getCountry(){
		return this.country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getInfo(){
		 return "country:" + this.country + ",province:" + this.province + ",city:" + this.city + ",street:" + this.street +",code:" + this.code;
	}
}
