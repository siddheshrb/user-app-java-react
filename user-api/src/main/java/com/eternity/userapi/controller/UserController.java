package com.eternity.userapi.controller;

import com.eternity.userapi.model.User;
import com.eternity.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/")
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/{id}")
    private User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping(path = "/")
    private User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping(path = "/")
    private User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping(path = "/{id}")
    private Long deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}
