package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"test","service"})
public class MainController {
	
	public static void main(String[] args) {
		SpringApplication.run(MainController.class, args);
	}

}
