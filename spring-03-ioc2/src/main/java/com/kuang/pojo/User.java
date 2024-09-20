package com.kuang.pojo;

public class User {
    private String name;

//    public User() {
//        System.out.println("User的无参构造! ");    //(无参构造创建对象) 报错: 因为没有无参构造
//    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name" + name);
    }
}
