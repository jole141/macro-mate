package com.zeus.dto;

import com.zeus.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserInfoDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Double weight;
    private Double height;
    private Double bmi;
    private Double rating;
    private String description;
    private Role role;
    private UserInfoDTO personalTrainer;

    public UserInfoDTO(Long id, String firstName, String lastName, String username, String email, Double weight, Double height, Double bmi, Double rating, String description, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
        this.rating = rating;
        this.description = description;
        this.role = role;
    }
}
