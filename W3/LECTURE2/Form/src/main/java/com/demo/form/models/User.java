package com.demo.form.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	// id 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	// model attribute
	@Size(min=2,message="The userName must ...")
	private String userName;
	
	
	private String password;

	public User() {
	}

	public User(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
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
	

}
