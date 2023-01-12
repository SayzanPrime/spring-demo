package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.dto.UsersDto;
import com.example.springdemo.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/save")
    public UsersDto save(@RequestBody UsersDto usersDto) {
        return usersService.save(usersDto);
    }

    @GetMapping("/all")
    public List<UsersDto> getUsers() {
        return usersService.findAll();
    }
}
