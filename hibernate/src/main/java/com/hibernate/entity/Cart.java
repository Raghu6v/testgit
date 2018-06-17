package com.hibernate.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CART")
public class Cart {

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Cart_id_seq")
	//@SequenceGenerator(sequenceName="Cart_id_seq",name="Cart_id_seq")
	@Column(name="cart_id")
	private int id;
	
	@Column(name="total")
	private int total;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="Cart")
	private Set<Items> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	
	
}
