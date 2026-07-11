package com.meuportfolio.sistemaweb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.meuportfolio.sistemaweb.entities.Order;
import com.meuportfolio.sistemaweb.entities.User;
import com.meuportfolio.sistemaweb.repositories.OrderRepository;
import com.meuportfolio.sistemaweb.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "9999999", "123456");
		
		Order o1 = new Order(null, Instant.parse("2026-07-11T11:56:39Z"), u1);
		Order o2 = new Order(null, Instant.parse("2026-07-11T01:59:39Z"), u2);
		Order o3 = new Order(null, Instant.parse("2026-07-11T16:23:39Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));  
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
