package com.example.springboot.hiber.dao;



import com.example.springboot.hiber.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    User getUserById(int id);

    void deleteUserById(int id);

    void changeUserById(int id, User user);

    List<User> getUsers();
}
