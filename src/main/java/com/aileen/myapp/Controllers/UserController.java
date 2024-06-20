package com.aileen.myapp.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.aileen.myapp.Model.UserModel;

@RestController
public class UserController {

    // http:localhost:8080/user
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "aileen", "aileen@email.com", "aileen");
    }

    public String getMethodName(@RequestParam String param){
        return new String();
    }

    // http:localhost:8080/users
    @GetMapping("/users")
    public List<UserModel> getUsers(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(1, "jai", "jai@email.com", "jai"));
        users.add(new UserModel(2, "ai", "ai@email.com", "ai"));
        users.add(new UserModel(3, "ann", "ann@email.com", "ann"));
        return users;
    }

    @GetMapping("/user/{name}")
    public UserModel getUserFromName(@PathVariable("name")String name){
        return new UserModel(1, "jose", "jose@email.com", "jose");
    }
    
}
