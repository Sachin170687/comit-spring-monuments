package org.comit.spring.bean;

public class LoginUser {
	
	String loginemail;
	String loginpassword;
	public String getLoginemail() {
		return loginemail;
	}
	public void setLoginemail(String loginemail) {
		this.loginemail = loginemail;
	}
	public String getLoginpassword() {
		return loginpassword;
	}
	public void setLoginpassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}
	@Override
	public String toString() {
		return String.format("LoginUser [loginemail=%s, loginpassword=%s]", loginemail, loginpassword);
	}
	
	

}
