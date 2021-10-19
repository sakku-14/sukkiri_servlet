package model;

import java.io.Serializable;

public class User implements Serializable {
	private String id;
	private String pass;
	private String name;
	
	public User() {
	}
	
	public User(String i, String p, String n) {
		this.id = i;
		this.pass = p;
		this.name = n;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}