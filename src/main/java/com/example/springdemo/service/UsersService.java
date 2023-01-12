package com.example.springdemo.service;

import java.util.List;

import com.example.springdemo.dto.UsersDto;

public interface UsersService {

    List<UsersDto> findAll();

    UsersDto save(UsersDto usersDto);
}
