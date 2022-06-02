package com.jdbc.dao.user;

import com.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User select(String username);
}
