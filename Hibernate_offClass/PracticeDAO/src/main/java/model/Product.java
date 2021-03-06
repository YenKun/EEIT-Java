package model;
// default package
// Generated 2018/1/18 �W�� 09:36:27 by Hibernate Tools 5.2.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "Product", schema = "dbo", catalog = "java")
public class Product implements java.io.Serializable {
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", make=" + make + ", expire=" + expire
				+ "]";
	}

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Double price;
	private Date make;
	private Integer expire;

	public Product() {
	}

	public Product(int id) {
		this.id = id;
	}

	public Product(int id, String name, Double price, Date make, Integer expire) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.make = make;
		this.expire = expire;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", precision = 53, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "make", length = 23)
	public Date getMake() {
		return this.make;
	}

	public void setMake(Date make) {
		this.make = make;
	}

	@Column(name = "expire")
	public Integer getExpire() {
		return this.expire;
	}

	public void setExpire(Integer expire) {
		this.expire = expire;
	}

}
