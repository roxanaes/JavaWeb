package com.hampcode.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Long supplier;
	private Long category;
	
	@Column(name="uniprice",nullable = false)
	private Double uniprice;
	
	@Column(name="unistock",nullable = false)
	private Double unistock;
	
	
	public Double getUniprice() {
		return uniprice;
	}
	public void setUniprice(Double uniprice) {
		this.uniprice = uniprice;
	}
	public Double getUnistock() {
		return unistock;
	}
	public void setUnistock(Double unistock) {
		this.unistock = unistock;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSupplier() {
		return supplier;
	}
	public void setSupplier(Long supplier) {
		this.supplier = supplier;
	}
	public Long getCategory() {
		return category;
	}
	public void setCategory(Long category) {
		this.category = category;
	}
	
}
