package com.social;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.social.model.Post;
import com.social.model.User;
import com.social.repository.PostRepo;
import com.social.repository.UserRepo;

@SpringBootApplication
public class SocialAPI implements CommandLineRunner {

	@Autowired
	UserRepo userRepo;
	@Autowired
	PostRepo postRepo;

	public static void main(String[] args) {
		SpringApplication.run(SocialAPI.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Ziaul Haq");
		user.setBirtDate(LocalDate.now());

		Post post = new Post();
		post.setComment("this os for test");
		post.setUser(user);
		userRepo.save(user);
		postRepo.save(post);

	}
}
