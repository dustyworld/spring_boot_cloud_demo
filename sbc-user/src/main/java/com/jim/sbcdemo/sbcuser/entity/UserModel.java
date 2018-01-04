package com.jim.sbcdemo.sbcuser.entity;

/**
 * Created by itlocal on 2017/12/15.
 */
public class UserModel {
    private String name;
    private String address;
    private int age;
    private String sex;

    public UserModel() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
