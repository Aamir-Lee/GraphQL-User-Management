package com.LearningGraphQL.demo.service;

import com.LearningGraphQL.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>(List.of(
            new User(1, "Aamir", "aamir@guardian.dev"),
            new User(2, "Knight2", "knight@hjnight.dev"),
            new User(3, "Knight3", "knightf@jnight.dev"),
            new User(4, "Knight4", "knighqt@jnight.dev"),
            new User(5, "Knight5", "knighta@jnight.dev"),
            new User(6, "Knight6", "knightr@jnight.dev"),
            new User(7, "Knight7", "knigh3t@jnight.dev"),
            new User(8, "Knight8", "knig2ht@jnight.dev")
    ));

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(int id) {
        return users.stream().filter(user->user.getId()==id).findFirst();
    }

    public  User addUser(int id, String name, String email) {
        User newUser = new User(id, name, email);
        users.add(newUser);
        return newUser;
    }
}
