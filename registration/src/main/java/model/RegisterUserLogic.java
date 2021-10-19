package model;

public class RegisterUserLogic {
	public User user;
	
	public RegisterUserLogic(User u) {
		this.user = u;
	}
	
	public void exec() {
		System.out.println("pass RegisterUserLogic");
	}
}