package com.example.userapirestexample.domain.services.input;

import com.example.userapirestexample.application.user.Mapper;
import com.example.userapirestexample.domain.entity.User;

public class UserUpdateMapper implements Mapper<UserUpdateInput, User> {

	@Override
	public User map(UserUpdateInput input) {
		return new User()
			.setAge(input.getAge())
			.setLanguage(input.getLanguage())
			.setRank(input.getRank())
			.setCountry(input.getCountry())
			.setActive(input.isActive());
	}
}
