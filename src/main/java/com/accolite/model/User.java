package com.accolite.model;

import com.accolite.model.interfaces.UserInterface;

public class User implements UserInterface {

	private int userId;
	private String username;
	private int locationId;
	private String password;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void bookRoom() {

	}

	public void specialRequest() {
		
	}
}
