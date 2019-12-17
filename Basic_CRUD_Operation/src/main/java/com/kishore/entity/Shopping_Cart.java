package com.kishore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "shopping_cart")
public class Shopping_Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String product_name;
	private Integer quantity;
	private Double price;
	private Date created_date;

	public Shopping_Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shopping_Cart(Integer id, String product_name, Integer quantity, Double price, Date created_date) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.quantity = quantity;
		this.price = price;
		this.created_date = created_date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "product_name", nullable = false)
	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "price")
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	@Override
	public String toString() {
		return "Shopping_Cart [id=" + id + ", product_name=" + product_name + ", quantity=" + quantity + ", price="
				+ price + ", created_date=" + created_date + "]";
	}

}
