package com.collection.assignments;

public class Users {

	private int uId;
	
	private String userName;
	
	private String password;
	
	private String Address;
	
	private String mobileNo;
	
	private String city;

	
//	@Override
//	public String toString() {
//		return "Users [uId=" + uId + ", userName=" + userName + ", password=" + password + ", Address=" + Address
//				+ ", mobileNo=" + mobileNo + ", city=" + city + "]";
//	}


	
	
	public Users(int uId, String userName, String password, String address, String mobileNo, String city) {
		super();
		this.uId = uId;
		this.userName = userName;
		this.password = password;
		Address = address;
		this.mobileNo = mobileNo;
		this.city = city;
	}




	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
