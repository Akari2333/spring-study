package com.kuang.dao;

public class UserDaoOracleImpl implements UserDao{  // 新增需求2
    @Override
    public void getUser() {
        System.out.println("Oracle获取用户数据!");
    }
}
