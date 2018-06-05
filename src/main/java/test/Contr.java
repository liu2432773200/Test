package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;
import service.UserService;

@EnableAutoConfiguration
@Controller
public class Contr {
	@Autowired
	private UserService user;
	
	@RequestMapping("/index")
	public String index(String name) {
		if(name!=null){
			if(name.length()!=0){
				if(user.add(name)>0){
					System.out.println("添加成功");
				}else{
					System.out.println("添加失败");
				}
			}
		}
		// TODO Auto-generated method stub
		System.out.println("、");
		return "MyHtml";
	}
	@RequestMapping("/home")
	public String home() {
		List<User> users=user.getAlls();
		for (User user : users) {
			System.out.println(user.getB_id()+"\t"+user.getB_name());
		}
		System.out.println("、");
		return "MyHtml";
	}
}
