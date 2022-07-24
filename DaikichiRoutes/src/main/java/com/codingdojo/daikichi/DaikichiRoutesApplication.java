package com.codingdojo.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
		@RequestMapping("")
		public String welcom() {
			return "welcome";
		}
		
		@RequestMapping("/today")
		public String day() {
			return "Today you will find luck in all your endeavors!";
		}
		
		@RequestMapping("/tomorrow")
		public String tomorrow1() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		}
		
	

}
