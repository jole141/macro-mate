package com.zeus.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MealPlan {

    private Long id;
    private Long personalTrainerId;
    private Long clientId;

}
