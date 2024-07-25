package com.SoyHenry.PracticaH2.service;

import com.SoyHenry.PracticaH2.entity.User;
import com.SoyHenry.PracticaH2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.getUsers();
    }
}
