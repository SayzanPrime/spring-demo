package com.example.springdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.dto.UsersDto;
import com.example.springdemo.mapper.UsersMapper;
import com.example.springdemo.repository.UsersRepository;
import com.example.springdemo.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public UsersDto save(UsersDto usersDto) {
        return usersMapper.toUsersDto(
                usersRepository.save(
                        usersMapper.toUsers(usersDto)));
    }

    @Override
    public List<UsersDto> findAll() {
        return usersMapper.toUsersDtoList(
                usersRepository.findAll());
    }

}
