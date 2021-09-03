package com.example.userapirestexample.domain.services.input;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Accessors(chain = true)
@Data
public class UserCreateInput {

	private String firstname;

	private String lastname;

	private int age;

	private String language;

	private int rank;

	private String country;

	private String active;
}
