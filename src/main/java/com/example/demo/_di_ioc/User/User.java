package com.example.demo._di_ioc.User;

public class User {

    String name ;
    int age ;

    public User(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
    }
}
