package com.estudo.lojatestespringboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudo.lojatestespringboot.entities.User;
import com.estudo.lojatestespringboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Cesar", "cesar@gmail.com", "963258741", "senha");
		User u2 = new User(null, "Diogo", "diogo@gmail.com", "987456321", "senha");
		User u3 = new User(null, "Rodrigo", "rodrigo@gmail.com", "999999999", "senha");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}

}
