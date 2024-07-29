package com.zeus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MealIngredientDTO {

    private Long id;
    private String quantity;
    private String name;

}
