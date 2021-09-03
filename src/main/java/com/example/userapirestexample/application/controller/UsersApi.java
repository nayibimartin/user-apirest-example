package com.example.userapirestexample.application.controller;

import com.example.userapirestexample.application.controller.request.UserCreateRequest;
import com.example.userapirestexample.domain.entity.User;
import com.example.userapirestexample.domain.exception.ValidationException;
import com.example.userapirestexample.exception.ErrorResponse;
import com.example.userapirestexample.exception.ResourceCreateException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;


@Tag(name = "user", description = "Operations to manage users")
public interface UsersApi {

	@Operation(
		summary = "Create new user",
		description = "Create new user",
		operationId = "create"
	)
	@ApiResponses(value = {
		@ApiResponse(responseCode = "201", description = "Successful created user."),

		@ApiResponse(responseCode = "400", description = "Validation exception.", content = @Content(mediaType = "application/json", schema = @Schema(/*implementation = ValidationErrorResponse.class*/))),

		@ApiResponse(responseCode = "403", description = "Resource forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
	})
	ResponseEntity<User> create( @RequestBody(description = "New user", required = true) UserCreateRequest userCreateRequest) throws ResourceCreateException, ValidationException;
}