package org.ssglobal.training.codes.itemC;

import java.util.Date;

public class User {
	private String name;
	private Date birthday;
	private Address address;
	private Content[] content;
	private ProfilePicture profilePicture;
	private Game[] game;
	private User[] user;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public void addContent(Content cont) {
	}
}
