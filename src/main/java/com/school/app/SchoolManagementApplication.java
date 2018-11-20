package com.school.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.school.data.SchoolInMemoryData;
import com.school.service.SchoolInMemoryDataService;
import com.school.web.SchoolRestApi;

@SpringBootApplication
@Import(SchoolManagementApplication.Config.class)
public class SchoolManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Configuration
	static class Config {

		@Bean
		public SchoolRestApi schoolRestApi() {
			return new SchoolRestApi(new SchoolInMemoryDataService(new SchoolInMemoryData()));
		}
	}
}
