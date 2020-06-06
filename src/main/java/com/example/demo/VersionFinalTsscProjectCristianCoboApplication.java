package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

import com.example.demo.Modelo.TsscAdmin;
import com.example.demo.Service.ITsscAdminService;

@SpringBootApplication
public class VersionFinalTsscProjectCristianCoboApplication {


	@Bean
	public Java8TimeDialect java8TimeDialect() {
		return new Java8TimeDialect();
	}
	
	public static void main(String[] args) {
			SpringApplication.run(VersionFinalTsscProjectCristianCoboApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo(ITsscAdminService tssAdminService) {
		return (args) -> {
			TsscAdmin user_1 = new TsscAdmin();
			user_1.setUser("CristianCobo");
			user_1.setPassword("{noop}99012104282");
			user_1.setSuperAdmin("superAdministrator");
			tssAdminService.save(user_1);
			TsscAdmin user_2 = new TsscAdmin();
			user_2.setUser("FelipeLeon");
			user_2.setPassword("{noop}99012104282");
			user_2.setSuperAdmin("administrator");
			tssAdminService.save(user_2);

		};

	}
	


}
