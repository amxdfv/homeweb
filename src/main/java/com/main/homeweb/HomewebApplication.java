package com.main.homeweb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;


@SpringBootApplication
public class HomewebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}


	@Controller
	public class HelloController {

		@RequestMapping("/")
		public String doGet() {
		//	File MP = new File ("main.html");

			return "main.html";
		}



		@RequestMapping("/home")
		public String stit() {
			return "Ослик суслик паукан";
		}
	}

}
