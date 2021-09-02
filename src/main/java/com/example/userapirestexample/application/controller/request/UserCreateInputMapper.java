package com.example.userapirestexample.application.controller.request;

import com.example.userapirestexample.application.user.Mapper;
import com.example.userapirestexample.domain.services.input.UserCreateInput;
import org.springframework.stereotype.Component;

@Component
public class UserCreateInputMapper implements Mapper<UserCreateRequest, UserCreateInput> {

	@Override
	public UserCreateInput map(UserCreateRequest request) {
		return new UserCreateInput()
			.setFirstname(request.getFirstname())
			.setLastname(request.getLastname())
			.setAge(request.getAge())
			.setLanguage(request.getLanguage())
			.setRank(request.getRank())
			.setCountry(request.getCountry())
			.setActive(request.getActive());
	}
}
