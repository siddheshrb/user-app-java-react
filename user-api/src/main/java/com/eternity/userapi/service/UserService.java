package com.eternity.userapi.service;

import com.eternity.userapi.dao.UserRepository;
import com.eternity.userapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        User u = userRepository.findById(user.getId()).orElse(null);
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        u.setPassword(user.getPassword());
        return userRepository.save(u);
    }

    public Long deleteUser(Long id) {
        userRepository.deleteById(id);
        return id;
    }
}
