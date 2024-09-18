package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserServiceImpl();
    private UserDao userDao = new UserDaoMysqlImpl();   // 更改实现, 新的用户UserDaoMysqlImpl才可以应用

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
