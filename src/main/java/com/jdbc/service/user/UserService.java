package com.jdbc.service.user;

import com.Entity.User;
import com.jdbc.dao.user.UserDao;
import com.jdbc.dao.user.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户类的业务类。方法包括查询用户。
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询用户的方法。
     *
     * @param username 用户名
     * @return 查询得到的用户类
     */
    public User selectUser(String username) {
        return userDao.select(username);
    }
}
