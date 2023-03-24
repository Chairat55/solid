package com.example.solid.D.After;

public class User implements IKeyboard {
    private final IKeyboard keyboard;

    public User(IKeyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String getKeyboardType() {
        return this.keyboard.getKeyboardType();
    }
}
