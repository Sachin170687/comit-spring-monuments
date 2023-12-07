package org.comit.spring.service;

import java.util.List;

import org.comit.spring.bean.User;
import org.comit.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDao userdao;
	
	public List<User> listusers(){
		
		List<User> users= this.userdao.listusers();
		return users;
	}
	
	public void createUser(User user) {
		this.validateUser(user);
		this.userdao.createUser(user);
	}
	
	public User findUser(int idUser) {
		
		return this.userdao.findUser(idUser);
	}
	
	public void updateUser(User user) {
		this.validateUser(user);
		this.userdao.updateUser(user);
	}
	
	public void deleteUser(int idUser) {
		this.userdao.deleteUser(idUser);
	}
	
	
	private void validateUser(User user) {
		
		if (user.getFirstName().isEmpty() || 
			 user.getLastName().isEmpty() ||
			              user.getEmail().isEmpty() 
			              )
		{
			               
			throw new RuntimeException("Invalid User Data: "+user); 
		}
		 
			
	}
}
