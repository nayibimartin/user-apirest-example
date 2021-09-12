package com.example.userapirestexample.application.controller.request;

import com.example.userapirestexample.application.user.Mapper;
import com.example.userapirestexample.domain.services.input.UserUpdateInput;

public class UserUpdateInputMapper implements Mapper<UserUpdateRequest, UserUpdateInput> {

	@Override
	public UserUpdateInput map(UserUpdateRequest request) {

		return new UserUpdateInput()
			.setAge(request.getAge())
			.setLanguage(request.getLanguage())
			.setRank(request.getRank())
			.setCountry(request.getCountry())
			.setActive(request.isActive());

	}

}
