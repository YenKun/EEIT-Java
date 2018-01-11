package model;

import java.util.Arrays;

public class CustomerBean {
	private String custid;
	private byte[] password;
	private String email;
	private java.util.Date birth;
	public String getCustid() {
		return custid;
	}
	
	
	@Override
	public String toString() {
		return "CustomerBean [custid=" + custid + ", password=" + Arrays.toString(password) + ", email=" + email
				+ ", birth=" + birth + "]";
	}


	public void setCustid(String custid) {
		this.custid = custid;
	}
	public byte[] getPassword() {
		return password;
	}
	public void setPassword(byte[] password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public java.util.Date getBirth() {
		return birth;
	}
	public void setBirth(java.util.Date birth) {
		this.birth = birth;
	}
	
}
