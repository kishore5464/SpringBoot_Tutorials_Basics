package com.kishore.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Users {

	@NotNull
	@Size(min = 3, max = 10)
	private String userId;
	@NotNull
	@Size(min = 5, max = 20)
	private String userName;
	@NotNull
	private String gender;
	private Boolean married;
	private String profile;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
}