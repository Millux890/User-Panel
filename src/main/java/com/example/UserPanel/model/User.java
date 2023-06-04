package com.example.UserPanel.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dateOfBirth;
    private String gender;

    @Override
    public String toString() {
        return "User [firstname=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password + ", dateOfBirth=" + dateOfBirth
                + ", gender=" + gender + "]";

    }
}
