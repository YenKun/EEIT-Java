package model;
// default package
// Generated 2018/1/18 �W�� 09:36:27 by Hibernate Tools 5.2.6.Final

import java.util.Arrays;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", schema = "dbo", catalog = "java")
public class Customer implements java.io.Serializable {
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", password=" + Arrays.toString(password) + ", email=" + email
				+ ", birth=" + birth + "]";
	}

	private static final long serialVersionUID = 1L;
	
	private String custid;
	private byte[] password;
	private String email;
	private Date birth;

	public Customer() {
	}

	public Customer(String custid) {
		this.custid = custid;
	}

	public Customer(String custid, byte[] password, String email, Date birth) {
		this.custid = custid;
		this.password = password;
		this.email = email;
		this.birth = birth;
	}

	@Id

	@Column(name = "custid", unique = true, nullable = false, length = 20)
	public String getCustid() {
		return this.custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	@Column(name = "password")
	public byte[] getPassword() {
		return this.password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	@Column(name = "email", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birth", length = 23)
	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

}