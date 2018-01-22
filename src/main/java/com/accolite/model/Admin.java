package com.accolite.model;

import com.accolite.interfaces.AdminInterface;

public class Admin extends User implements AdminInterface{
	
	private String password;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void addRoom() {
		// TODO Auto-generated method stub
		
	}
	public void changeAvailability() {
		// TODO Auto-generated method stub
		
	}
	public void acceptRequest() {
		// TODO Auto-generated method stub
		
	}
}
