package com.phoenix;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.phoenix.usermgmt.dao.UserRepository;
import com.phoenix.usermgmt.entities.User;

@SpringBootApplication
public class PhoenixprepApplication {
	
	private static final Logger log = LoggerFactory.getLogger(PhoenixprepApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PhoenixprepApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a couple of customers
			log.info("Starting to insert test records");
			repository.save(new User("address1", "address2", true, "Edison", "USA", "US", "p@g.com", "John", new Date(), "Doe", "New Jersey", 1, false, new Date(), "1111"));
			repository.save(new User("address1", "address2", true, "Edison", "USA", "US", "p@g.com", "Shaun", new Date(), "Smith", "New Jersey", 1, false, new Date(), "1111"));
			repository.save(new User("address1", "address2", true, "Edison", "USA", "US", "p@g.com", "Ron", new Date(), "Clinton", "New Jersey", 1, false, new Date(), "1111"));
			repository.save(new User("address1", "address2", true, "Edison", "USA", "US", "p@g.com", "Don", new Date(), "Regan", "New Jersey", 1, false, new Date(), "1111"));
			repository.save(new User("address1", "address2", true, "Edison", "USA", "US", "p@g.com", "Paul", new Date(), "Vegan", "New Jersey", 1, false, new Date(), "1111"));
			
			// fetch all customers
			log.info("Users found with findAll():");
			log.info("-------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
            log.info("");

			// fetch an individual customer by ID
			User customer = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
            log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (User clinton : repository.findByLastName("Clinton")) {
				log.info(clinton.toString());
			}
            log.info("");
		};
	}

}
