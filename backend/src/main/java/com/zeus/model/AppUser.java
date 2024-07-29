package com.zeus.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class AppUser {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private Double weight;
    private Double height;
    private String description;
    private Long roleId;

    public AppUser(Long id, String firstName, String lastName, String username, String password, String email, Double height, String description, Long roleId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.height = height;
        this.description = description;
        this.roleId = roleId;
    }
}
