package com.example.solid.D.After;

import java.util.List;

public class DisplayKeywordTypeByUser {
    public void show() {
        List<User> users = List.of(
                new User(new StandardKeyboard()),
                new User(new MechanicalKeyboard())
        );

        for (User user : users) {
            user.getKeyboardType();
        }
    }
}
