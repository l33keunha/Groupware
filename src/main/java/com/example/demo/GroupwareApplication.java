package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@SpringBootApplication(scanBasePackages="com.example.demo.Test")
public class GroupwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupwareApplication.class, args);
	}

	@Bean
	MappingJackson2JsonView jsonView(){
        return new MappingJackson2JsonView();
    }
}
