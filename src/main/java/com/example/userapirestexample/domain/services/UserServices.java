package com.example.userapirestexample.domain.services;

import com.example.userapirestexample.application.user.Mapper;
import com.example.userapirestexample.domain.entity.User;
import com.example.userapirestexample.domain.repository.UserRepository;
import com.example.userapirestexample.domain.services.input.UserCreateInput;
import com.example.userapirestexample.exception.ResourceCreateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

	private final UserRepository repository;

	private final Mapper<UserCreateInput, User> userMapper;

	@Autowired
	public UserServices(
		UserRepository repository,
		Mapper<UserCreateInput, User> userMapper
	) {
		this.repository = repository;
		this.userMapper = userMapper;
	}

	public User create(UserCreateInput input) throws ResourceCreateException {

		return repository.create(this.userMapper.map(input));

	}

}
