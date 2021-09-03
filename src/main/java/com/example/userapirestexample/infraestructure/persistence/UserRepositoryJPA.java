package com.example.userapirestexample.infraestructure.persistence;

import com.example.userapirestexample.domain.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJPA extends PagingAndSortingRepository<User,Integer> {

}
