package com.accolite.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.accolite.model.User;

public class LoginDaoImpl implements LoginDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void registerUser(User user) {

		String sql = "insert into user (userID, username, userPassword, userLocID) values(?,?,?,?)";
		jdbcTemplate.update(sql, user.getUserId(), user.getUsername(), user.getPassword(), user.getLocationId());

	}

	public User validateDetails(User user) {
		String sql = "select * from user where username='" + user.getUsername() + "' and userPassword='"
				+ user.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.isEmpty() ? null : users.get(0);

		// TODO check admin
	}
}

class UserMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("userPassword"));
		user.setLocationId(rs.getInt("userLocID"));
		return user;
	}
}
