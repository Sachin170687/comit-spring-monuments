package org.comit.spring.bean;



public class User {
	
	int idUser;
    String firstName;
    String lastName;
    String email;
    String password;
    String contactNumber;
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return String.format("User [idUser=%s, firstName=%s, lastName=%s, email=%s, password=%s, contactNumber=%s]",
				idUser, firstName, lastName, email, password, contactNumber);
	}
	
    

}
