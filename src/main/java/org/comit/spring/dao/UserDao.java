package org.comit.spring.dao;

import java.util.List;

import org.comit.spring.bean.User;
import org.comit.spring.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<User> listusers(){
		String sql="SELECT * FROM USERS";
	    return this.jdbctemplate.query(sql,new UserMapper());
	}
	
	public void createUser(User user) {
		String sql="INSERT INTO USERS (FNAME,LNAME,EMAIL,PASSWRD,CONTACT_NO)" 
				    + "VALUES (?,?,?,?,?)";
		this.jdbctemplate.update(sql, user.getFirstName(),
				user.getLastName(),user.getEmail(),user.getPassword(),user.getContactNumber());			
	}
	
	public User findUser(int idUser) {
		String sql= "SELECT * FROM USERS WHERE USER_ID= ? ";
		return DataAccessUtils.singleResult(this.jdbctemplate.query(sql,new UserMapper(),idUser));	
	}
	
	public  void updateUser(User user) {
		String sql="UPDATE USERS SET FNAME = ?,LNAME = ?,EMAIL = ?,CONTACT_NO = ?" 
				    + "WHERE USER_ID= ?";
		 this.jdbctemplate.update(sql, user.getFirstName(),
				user.getLastName(),user.getEmail(),user.getContactNumber(),user.getIdUser());			
	}
	
	public  void deleteUser(int idUser) {
		String sql="DELETE FROM USERS WHERE USER_ID= ?";
		 this.jdbctemplate.update(sql,idUser);			
	}

	
}
