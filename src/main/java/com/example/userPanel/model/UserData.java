package com.example.userPanel.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "user_data")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    @NotEmpty
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "birth_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateOfBirth;
    @Column(name = "gender")
    private String gender;

    @Override
    public String toString() {
        return "User [firstname=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password + ", dateOfBirth=" + dateOfBirth
                + ", gender=" + gender + "]";

    }
}
