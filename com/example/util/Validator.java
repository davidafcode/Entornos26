package com.example.util;

public class Validator {

    public static boolean validateEmail(String email) {
        return email.contains("@");
    }

    public static boolean validateName(String name) {
        return !name.trim().isEmpty();
    }
}