package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "senior")
	private boolean senior;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getSenior() {
		return senior;
	}
	
	public void setSenior(boolean senior) {
		this.senior = senior;
	}
	
	protected Customer() {
		super();
	}
	
	
}
