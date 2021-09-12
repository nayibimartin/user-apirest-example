package com.example.userapirestexample.domain.services;

import com.example.userapirestexample.application.user.Mapper;
import com.example.userapirestexample.domain.entity.User;
import com.example.userapirestexample.domain.repository.UserRepository;
import com.example.userapirestexample.domain.services.input.UserCreateInput;
import com.example.userapirestexample.domain.services.input.UserUpdateInput;
import com.example.userapirestexample.exception.ResourceCreateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

	private final UserRepository repository;

	private final Mapper<UserCreateInput, User> userCreateMapper;

	private final Mapper<UserUpdateInput, User> userUpdateMapper;

	@Autowired
	public UserServices(
		UserRepository repository,
		Mapper<UserCreateInput, User> userCreateMapper,
		Mapper<UserUpdateInput, User> userUpdateMapper
	) {
		this.repository = repository;
		this.userCreateMapper = userCreateMapper;
		this.userUpdateMapper = userUpdateMapper;
	}


	public User create(UserCreateInput input) throws ResourceCreateException {

		return repository.create(this.userCreateMapper.map(input));

	}

	public User update(UserUpdateInput input) throws ResourceCreateException {

		return repository.update(this.userUpdateMapper.map(input));
	}

}
