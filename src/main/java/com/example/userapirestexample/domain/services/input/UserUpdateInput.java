package com.example.userapirestexample.domain.services.input;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserUpdateInput {

	private int age;

	private String language;

	private int rank;

	private String country;

	private boolean active;

}
