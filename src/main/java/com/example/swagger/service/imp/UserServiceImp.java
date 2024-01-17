package com.example.swagger.service.imp;

import com.example.swagger.model.User;
import com.example.swagger.repo.UserRepo;
import com.example.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> creatUser() {
        return null;
    }

    @Override
    public List<User> getalluser(User user) {
        return userRepo.findAll();
    }
}
