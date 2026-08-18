package com.LearningGraphQL.demo.service;

import com.LearningGraphQL.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>(List.of(
            new User(UUID.randomUUID(), "Aamir", "aamir@guardian.dev"),
            new User(UUID.randomUUID(), "Knight2", "knight@hjnight.dev"),
            new User(UUID.randomUUID(), "Knight3", "knightf@jnight.dev"),
            new User(UUID.randomUUID(), "Knight4", "knighqt@jnight.dev"),
            new User(UUID.randomUUID(), "Knight5", "knighta@jnight.dev"),
            new User(UUID.randomUUID(), "Knight6", "knightr@jnight.dev"),
            new User(UUID.randomUUID(), "Knight7", "knigh3t@jnight.dev"),
            new User(UUID.randomUUID(), "Knight8", "knig2ht@jnight.dev")
    ));

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(UUID id) {
        return users.stream().filter(user->user.getId().equals(id));
    }

    public  User addUser(UUID id, String name, String email) {
        User newUser = new User(UUID.randomUUID(), name, email);
        users.add(newUser);
        return newUser;
    }
}
