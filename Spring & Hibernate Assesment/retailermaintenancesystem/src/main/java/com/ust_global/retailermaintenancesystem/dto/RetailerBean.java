package com.ust_global.retailermaintenancesystem.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="retailer")
public class RetailerBean {

	@Id
	@Column
	@GeneratedValue
	private int rId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="prid")
	private ProductBean productBean;
	
	
	
	public ProductBean getProductBean() {
		return productBean;
	}
	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
