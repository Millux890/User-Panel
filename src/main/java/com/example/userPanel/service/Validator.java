package com.example.userPanel.service;

import com.example.userPanel.ProgramError;
import com.example.userPanel.model.UserData;

import java.util.regex.Pattern;

public class Validator {

    private final String emailPattern = "^(.+)@(\\S+)$";

    private final int passwordLength = 5;

    public void validateUser(UserData userData) throws Exception {
        validateEmail(userData.getEmail());
        validatePassword(userData.getPassword());
    }

    private void validateEmail(String email) throws Exception {
        if (email.isEmpty()) {
            throw new Exception("email " + ProgramError.EMPTY_VALUE);
        }
        if (!patternMatches(email, emailPattern)) {
            throw new Exception("email " + ProgramError.INVALID_VALUE);
        }
    }

    private void validatePassword(String password) throws Exception {
        if (password.isEmpty()) {
            throw new Exception("password " + ProgramError.EMPTY_VALUE + "!");
        }
        if (password.length() < passwordLength) {
            throw new Exception("Password must be longer than 4!");
        }
    }

    private boolean patternMatches(String value, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(value)
                .matches();
    }


}
