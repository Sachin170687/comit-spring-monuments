package org.comit.spring.bean;

public class LoginUser {
	
	String email;
	String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("LoginUser [email=%s, password=%s]", email, password);
	}
	
	
	

}
