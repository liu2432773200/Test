package cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.entity.User;
import cn.mapper.TestMapper;
import cn.service.UserService;

@Controller
public class Contr {
	@Autowired
	private UserService user;
	@Autowired
	private TestMapper testMapper;

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

	@RequestMapping("/test")
	public String test(String name) {
		if(name!=null){
			if(name.length()!=0){
				if(testMapper.add(name)>0){
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

	@RequestMapping("/jsp")
	public String jsp(ModelMap map) {
		List<User> users=user.getAlls();
		for (User user : users) {
			System.out.println(user.getB_id()+"\t"+user.getB_name());
		}
		map.addAttribute("userList", users);
		return "MyJsp";
	}
}
