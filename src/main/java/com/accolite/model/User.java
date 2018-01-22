package com.accolite.model;

import com.accolite.interfaces.UserInterface;

public class User implements UserInterface{
	
	private int userId;
	private String userName;
	private int locationId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void bookRoom() {
		// TODO Auto-generated method stub
		
	}
	public void specialRequest() {
		// TODO Auto-generated method stub
		
	}
}
