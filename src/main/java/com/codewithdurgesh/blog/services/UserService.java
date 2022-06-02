package com.codewithdurgesh.blog.services;

import com.codewithdurgesh.blog.entities.User;
import com.codewithdurgesh.blog.payloads.UserDto;import antlr.collections.List;

public interface UserService {
UserDto createUser(UserDto user);
UserDto updateUser(UserDto user,Integer userId);
UserDto getUserById(Integer userId);
java.util.List<UserDto> getAllUsers();
void deleteUser(Integer userId);
}
