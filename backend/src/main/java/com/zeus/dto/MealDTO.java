package com.zeus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class MealDTO implements Comparable<MealDTO>{

    private Long id;
    private String name;
    private Long mealPlanId;
    private String description;
    private String preparationTime;
    private String mealType;
    private Date mealDateTime;
    private List<MealIngredientDTO> ingredients;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MealDTO mealDTO = (MealDTO) o;
        return mealDateTime.equals(mealDTO.mealDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mealDateTime);
    }

    @Override
    public int compareTo(MealDTO o) {
        return this.mealDateTime.compareTo(o.mealDateTime);
    }
}
