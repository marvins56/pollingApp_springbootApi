package com.example.pollingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = { 
		PollingAppApplication.class,
		Jsr310JpaConverters.class 
})
public class PollingAppApplication {
	
	@jakarta.annotation.PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(PollingAppApplication.class, args);
	}

}
