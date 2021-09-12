package com.example.userapirestexample.infraestructure;

import com.example.userapirestexample.domain.entity.User;
import com.example.userapirestexample.domain.exception.ResourceUpdateException;
import com.example.userapirestexample.domain.repository.UserRepository;
import com.example.userapirestexample.infraestructure.persistence.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

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

	@Override
	public User update(User user) throws ResourceUpdateException {

		Optional<User> userFound = repository.findById(user.getId());

		User userUpdate = userFound.get();

		userUpdate.setAge(user.getAge())
			.setLanguage(user.getLanguage())
			.setRank(user.getRank())
			.setCountry(user.getCountry())
			.setActive(user.getActive());

		return repository.save(userUpdate);


	}

}



