package com.example;
public class Account {
    private final String name;
    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() {
        if (this.name == null) {
            return false;}
        return name.matches("(?=.{3,19}$)[a-zA-Zа-яА-Я]+\\s[a-zA-Zа-яА-Я]+");
    }
}