package com.travis.example.travis;

import javax.xml.ws.RespectBinding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisApplication {

	@GetMapping("/appName")
	public String  getAppName(){
		return "travis-Example-Demo";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(TravisApplication.class, args);
	}

}
