package com.example.first.rest.api;

public class User {

    String name;
    int age;
    int userId;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userId=" + userId +
                '}';
    }

    User(){

    }

    public User(String name, int age, int userId) {
        this.name = name;
        this.age = age;
        this.userId = userId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getuserId() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }
}
