package com.example.HilelTask11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void addUser(User user) {
        userRepository.save(user);
    }


    public void removeUser(String username) {
        userRepository.deleteById(username);
    }


    public User getUser(String username) {
        return userRepository.findById(username).orElse(null);
    }
}