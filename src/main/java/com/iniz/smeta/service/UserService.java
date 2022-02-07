package com.iniz.smeta.service;

import com.iniz.smeta.dto.UserDto;
import com.iniz.smeta.exception.ValidationException;

import java.util.List;

public interface UserService {

    UserDto saveUser(UserDto userDto) throws ValidationException;

    void deleteUser(Integer userId);

    UserDto findByLogin(String login);

    List<UserDto> findAll();

}
