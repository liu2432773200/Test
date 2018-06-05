package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import entity.User;

@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbctemp;
	
	public int add(String name){
		return jdbctemp.update("INSERT INTO `bookmanage`(b_name) VALUE(?)",name);
	}
	public List<User> getAlls(){
		return jdbctemp.query("SELECT *FROM `bookmanage`",new Object[]{}, new BeanPropertyRowMapper(User.class));
	}
}
