package com.example.swagger.controller;

import com.example.swagger.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/home")
public class HomeController {


        @Autowired
        private UserServiceImp userService;


        @GetMapping("/current-user")
        public String getLoggInUser(Principal principal){
            return principal.getName();
        }


}
