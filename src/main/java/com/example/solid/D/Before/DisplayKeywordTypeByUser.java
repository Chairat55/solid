package com.example.solid.D.Before;

import java.util.List;

public class DisplayKeywordTypeByUser {
    public void show() {
        List<User> users = List.of(new User(), new User());

        for (User user : users) {
            // If something to separate standard keyword user
            if ("1".equals(user.getStandardKeyboard().getKeyboardType())) {
                user.getStandardKeyboard().getKeyboardType();
            }

            // If something to separate mechanical keyword user
            else if ("2".equals(user.getMechanicalKeyboard().getKeyboardType())) {
                user.getMechanicalKeyboard().getKeyboardType();
            }
        }
    }
}
