package com.zeus.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MealIngredient {

    private Long meal_id;
    private String quantity;

}
