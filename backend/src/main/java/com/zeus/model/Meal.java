package com.zeus.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@AllArgsConstructor
@Getter
@Setter
public class Meal {

    private Long id;
    private String name;
    private Long mealPlanId;
    private String description;
    private String preparationTime;
    private Long mealTypeId;
    private Date mealDateTime;

}
