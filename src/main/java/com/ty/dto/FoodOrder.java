package com.ty.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String toname;
	private String status;
	@OneToMany
	List<Item> items;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToname() {
		return toname;
	}
	public void setToname(String toname) {
		this.toname = toname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}
