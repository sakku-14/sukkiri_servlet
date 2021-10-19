package model;

public class UserChecker {
	private User user;
	
	public UserChecker(User u) {
		this.user = u;
	}
	
	public boolean checkPassword () {
		if (this.user.getPass().equals("1234")) {
			return true;
		}
		return false;
	}
}