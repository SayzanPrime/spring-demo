package com.example.springdemo.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.springdemo.dto.UsersDto;
import com.example.springdemo.entity.Users;

@Component
public class UsersMapper {

    public UsersDto toUsersDto(Users users) {
        return new UsersDto(
                users.getId(),
                users.getFirstName(),
                users.getLastName());
    }

    public Users toUsers(UsersDto usersDto) {
        return new Users(
                usersDto.getId(),
                usersDto.getFirstName(),
                usersDto.getLastName());
    }

    public List<UsersDto> toUsersDtoList(List<Users> usersList) {
        return usersList.stream()
                .map(this::toUsersDto)
                .collect(Collectors.toList());
    }

    public List<Users> toUsersList(List<UsersDto> usersDtoList) {
        return usersDtoList.stream()
                .map(this::toUsers)
                .collect(Collectors.toList());
    }
}
