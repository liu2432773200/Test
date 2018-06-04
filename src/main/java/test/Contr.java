package test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@Controller
public class Contr {
	
	@RequestMapping("/index")
	public String index() {
		// TODO Auto-generated method stub
		System.out.println("、");
		return "MyHtml";
	}
	/*public static void main(String[] args) {
		SpringApplication.run(Contr.class, args);
	}*/
}
