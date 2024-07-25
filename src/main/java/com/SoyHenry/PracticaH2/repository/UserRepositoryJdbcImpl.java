package com.SoyHenry.PracticaH2.repository;

import com.SoyHenry.PracticaH2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryJdbcImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User save(User user) {
       String sql = "INSERT INTO demouser (name, email) VALUES(?,?)";
       jdbcTemplate.update(sql, user.getName(), user.getEmail());
       return user;
    }

    @Override
    public List<User> getUsers() {
        String sql = "SELECT * FROM demouser";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));

            return user;
        });
    }
}
