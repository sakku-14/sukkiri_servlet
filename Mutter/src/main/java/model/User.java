package model;

public class User {
	private String name;
	private String pass;
	
	public User() {
	}
	public User(String n, String p) {
		this.name = n;
		this.pass = p;
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
	
}