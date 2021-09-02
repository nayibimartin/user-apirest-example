package com.example.userapirestexample.domain.services;

import com.example.userapirestexample.application.user.Mapper;
import com.example.userapirestexample.domain.entity.User;
import com.example.userapirestexample.domain.repository.UserRepository;
import com.example.userapirestexample.domain.services.input.UserCreateInput;
import com.example.userapirestexample.exception.ResourceCreateException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;

@RequiredArgsConstructor
@Transactional
@Slf4j
@Service
public class UserServices {

	private final UserRepository repository;

	private final Mapper<UserCreateInput, User> userMapper;

	public User create(UserCreateInput input) throws ResourceCreateException {

		return repository.save(this.userMapper.map(input));

	}

}
