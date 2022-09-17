package com.ukir.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class Springboot05MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot05MongodbApplication.class, args);
	}

}
