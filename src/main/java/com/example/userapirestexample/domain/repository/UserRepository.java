package com.example.userapirestexample.domain.repository;

import com.example.userapirestexample.domain.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,Integer> {

}
