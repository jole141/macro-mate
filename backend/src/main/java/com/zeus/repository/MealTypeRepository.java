package com.zeus.repository;

import com.zeus.model.MealType;

import java.util.List;

public interface MealTypeRepository {

    List<MealType> getAllMealTypes();

    MealType getMealTypeByName(String name);

    MealType getMealTypeById(Long id);

}
