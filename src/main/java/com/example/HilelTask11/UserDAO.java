package com.example.HilelTask11;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    User getUser(String username);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(String username);
}