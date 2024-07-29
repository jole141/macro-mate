package com.zeus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class ClientMealDTO {

    private String name;
    private int dayOfTheWeek;
    private Long mealPlanId;
    private String description;
    private String preparationTime;
    private List<MealIngredientDTO> ingredients;

}
