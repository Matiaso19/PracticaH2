package com.SoyHenry.PracticaH2.repository;

import com.SoyHenry.PracticaH2.entity.User;

import java.util.List;

public interface UserRepository {

    User save(User user);
    List<User> getUsers();

}
