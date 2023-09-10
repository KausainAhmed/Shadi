package com.gufran.shadi.model;

public class UserAccount {
	private int id;
	private int age;
	private String userName;
	private String password;
	private String email;
	private String phoneNumber;
	private String gender;
	private String city;
	private String country;
	
	public UserAccount(int id, int age, String userName, String passsword, String email, String phoneNumber,
			String gender, String city, String country, String password) {
		super();
		this.id = id;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.city = city;
		this.country = country;
	}

	public UserAccount() {
		super();
	}

	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", age=" + age + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", city=" + city
				+ ", country=" + country + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasssword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		
}
