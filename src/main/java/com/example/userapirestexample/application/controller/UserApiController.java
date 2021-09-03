package com.example.userapirestexample.application.controller;

import com.example.userapirestexample.application.controller.request.UserCreateRequest;
import com.example.userapirestexample.application.user.Mapper;
import com.example.userapirestexample.domain.entity.User;
import com.example.userapirestexample.domain.exception.ValidationException;
import com.example.userapirestexample.domain.services.UserServices;
import com.example.userapirestexample.domain.services.input.UserCreateInput;
import com.example.userapirestexample.exception.ResourceCreateException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserApiController implements UsersApi {

	private final UserServices userServices;

	private final Mapper<UserCreateRequest, UserCreateInput> userCreateMapper;

	@Override
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> create(
		@RequestBody @Valid UserCreateRequest userCreateRequest
	) throws ResourceCreateException, ValidationException {

		return ResponseEntity.ok(this.userServices.create(this.userCreateMapper.map(userCreateRequest)));

	}
}
