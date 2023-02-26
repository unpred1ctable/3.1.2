package com.example.demo.service;


import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void addUser(User user);

    User getUserById(int id);

    void updateUser(int id, User updateUser);

    void deleteUser(int id);
}
