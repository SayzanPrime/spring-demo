package com.example.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdemo.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
