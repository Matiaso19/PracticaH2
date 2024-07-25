package com.SoyHenry.PracticaH2.service;

import com.SoyHenry.PracticaH2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User createUser(User user);
    List<User> getUsers();

}
