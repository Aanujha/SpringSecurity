package com.example.swagger.service;

import com.example.swagger.model.User;

import java.util.List;

public interface UserService {

    List<User>  creatUser();

    List<User> getalluser(User user);
}
