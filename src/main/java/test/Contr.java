package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Contr {
	
	

	
	@RequestMapping("/index")
	public String index() {
		// TODO Auto-generated method stub
		System.out.println("、");
		return "sdsddsdsds";
	}
	/*public static void main(String[] args) {
		SpringApplication.run(Contr.class, args);
	}*/
}
