package com.SoyHenry.PracticaH2.controller;


import com.SoyHenry.PracticaH2.entity.User;
import com.SoyHenry.PracticaH2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> users = userService.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);

    }
}
