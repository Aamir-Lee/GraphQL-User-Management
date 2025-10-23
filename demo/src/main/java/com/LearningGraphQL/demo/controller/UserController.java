package com.LearningGraphQL.demo.controller;

import com.LearningGraphQL.demo.model.User;
import com.LearningGraphQL.demo.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    public List<User> allUsers(){
        return userService.getAllUsers();
    }

    @QueryMapping
    public User userById(@Argument("id") int id){
        return userService.getUserById(id).orElse(null);
    }

    @MutationMapping
    public User addUser(@Argument int id,
                        @Argument String name,
                        @Argument String email) {
        return userService.addUser(id, name, email);
    }
}
