package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("test")
public class MainController {

	public static void main(String[] args) {
		SpringApplication.run(MainController.class, args);
	}

}
