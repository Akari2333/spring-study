package com.kuang.pojo;

public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {      // day5
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    /*
    Student {
    name='小明',
    address=Address{address='null'},
    books=[红楼梦, 水浒传, 三国演义, 西游记],
    hobbies=[game, anime, sports],
    card={
        身份证=111111222222333333,
        银行卡=123123123123123
    },
    games=[LOL, COC, BOB],
    wife='null',
    info={
        password=123456,
        url=男,
        driver=20190525,
        username=小明
        }
    }
     */
}
