package org.comit.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.spring.bean.User;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User user=new User();
		
		
		user.setIdUser(rs.getInt("USER_ID"));;
		user.setFirstName(rs.getString("FNAME"));
		user.setLastName(rs.getString("LNAME"));
        user.setEmail(rs.getString("EMAIL"));
        user.setPassword(rs.getString("PASSWRD"));
        user.setContactNumber(rs.getString("CONTACT_NO"));
        
        
        return user;
	}

}
