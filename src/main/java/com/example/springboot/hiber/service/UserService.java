package com.example.springboot.hiber.service;



import com.example.springboot.hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User getUserById(int id);
    public List<User> getUsers();
    void changeUserById(int id, User user);
    void deleteUserById(int id);
}
