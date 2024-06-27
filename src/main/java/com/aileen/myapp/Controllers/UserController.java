package com.aileen.myapp.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aileen.myapp.Model.User;
import com.aileen.myapp.NotFoundException.UserNotFoundException;
import com.aileen.myapp.Repository.UserRepository;

@RestController
public class UserController {

    UserRepository repo;

    public UserController(UserRepository repo){
        this.repo = repo;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return repo.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return repo.findById(id).orElseThrow(
            () -> new UserNotFoundException(id)
        );

    }

    @PostMapping("/users/new")
    public String addUser(@RequestBody User newUser){
        repo.save(newUser);
        return "A new user is created.";
    }

    @PutMapping("/users/edit/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User newUser){
        return repo.findById(id)
        .map(user -> {
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            user.setPassword(newUser.getPassword());
            return repo.save(user);
        }).orElseGet(() -> {
            return repo.save(newUser);
        });

    }

    @DeleteMapping("/users/delete/{id}")
    public String deleteUser (@PathVariable Long id){
        repo.deleteById(id);
        return "The user is deleted.";
    }


}
