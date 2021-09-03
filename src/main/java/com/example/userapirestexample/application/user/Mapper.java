package com.example.userapirestexample.application.user;

public interface Mapper<T,V> {

	V map(T input);

}
