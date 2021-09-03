package com.example.userapirestexample.infraestructure;

import com.example.userapirestexample.domain.entity.User;
import com.example.userapirestexample.domain.repository.UserRepository;
import com.example.userapirestexample.infraestructure.persistence.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserPostgreSQLRepository implements UserRepository {

	private final UserRepositoryJPA repository;

	@Autowired
	public UserPostgreSQLRepository(UserRepositoryJPA repository) {
		this.repository = repository;
	}

	@Override
	public User create(User user) {
		return repository.save(user);
	}
}
