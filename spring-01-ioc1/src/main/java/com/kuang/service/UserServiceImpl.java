package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserServiceImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();   // 更改实现, 新的用户UserDaoMysqlImpl才可以应用
//    private UserDao userDao = new UserDaoOracleImpl();   // 更改实现, 新的用户UserDaoMysqlImpl才可以应用

    private UserDao userDao;

    // 利用set进行动态实现值的注入 (接口的思想)
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    // 效果: 使用了set注入, 程序不再有主动性, 而是变成了被动的接收对象, 由用户自己调用.
    // 也就是: 控制反转 IOC

    @Override
    public void getUser() {
        userDao.getUser();
    }

}
