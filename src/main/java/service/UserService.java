package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbctemp;
	
	public int add(String name){
		return jdbctemp.update("INSERT INTO `bookmanage`(b_name) VALUE(?)",name);
	}
}
