package com.alex.authserver.controller;

import com.alex.authserver.model.User;
import com.alex.authserver.service.UserDetailServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class LoginUserController {
    @Autowired
    private UserDetailServiceImpl userDetailsService;

    @PostMapping("/users")
    public User create(@RequestBody User user){
        log.info("Entering create UserLogin");
//        try {
            return userDetailsService.createUpdate(user);
//        }catch (Exception e){
//            log.error("Error occurred during create user {}", e.getMessage());
//        }
    }
    @GetMapping("/users")
    public List<User> getAll(){
        log.info("Entering create UserLogin");
//        try {
        return userDetailsService.getAll();
//        }catch (Exception e){
//            log.error("Error occurred during create user {}", e.getMessage());
//        }
    }

}
