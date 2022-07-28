package com.example;

public class Praktikum {

    public static void main(String[] args) {

        String name = "Котани Ямада";
        Account account = new Account(name);

        if (account.checkNameToEmboss()) {
            System.out.println("Имя: [" + name + "] корректно");
        } else {
            System.out.println("Имя: [" + name + "] некорректно");
        }
    }
}