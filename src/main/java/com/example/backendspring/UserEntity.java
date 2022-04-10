package com.example.backendspring;

public class UserEntity {
    public int Id;
    public String Name;
    public int Age;

//    public UserEntity(int id, String name, int age) {
//        Id = id;
//        Name = name;
//        Age = age;
//    }

    public UserEntity(String name, int age) {
        Name=name;
        Age=age;
    }
}
