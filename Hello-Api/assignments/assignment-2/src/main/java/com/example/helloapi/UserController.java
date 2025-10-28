package com.example.helloapi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<>();

    @PostMapping
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @GetMapping
    public List<User> getAllUsers() { return users; }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User newUser) {
        for (User u : users) {
            if (u.getId() == id) {
                u.setName(newUser.getName());
                u.setEmail(newUser.getEmail());
                return u;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        users.removeIf(u -> u.getId() == id);
        return "User with ID " + id + " deleted.";
    }
}
