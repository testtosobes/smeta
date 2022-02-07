package com.iniz.smeta.service;

import com.iniz.smeta.dto.UserDto;
import com.iniz.smeta.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User fromUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setLogin(userDto.getLogin());
        return user;
    }

    public UserDto fromUserToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .login(user.getLogin())
                .name(user.getName())
                .build();
    }
}
