package com.zeus.controller;

import com.zeus.dto.MealDTO;
import com.zeus.model.MealType;
import com.zeus.service.MealService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "meal")
public class MealPlanController {

    private final MealService mealService;

    public MealPlanController(MealService mealService) {
        this.mealService = mealService;
    }

    @PostMapping
    public ResponseEntity<Void> addNewMeal(@RequestBody MealDTO mealDTO, @RequestParam Long clientId) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        mealService.saveNewMeal(mealDTO, clientId, username);
        return ResponseEntity.ok().build();
    }

    @GetMapping("client-meals")
    public ResponseEntity<List<List<MealDTO>>> getClientMeals(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date weekDate) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(mealService.getClientMeals(username, weekDate));
    }

    @GetMapping("client-meals-day")
    public ResponseEntity<List<MealDTO>> getClientMealsDay(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dayDate) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(mealService.getClientMealsDay(username, dayDate));
    }

    @GetMapping("trainer-meals")
    public ResponseEntity<List<List<MealDTO>>> getTrainerClientMeals(@RequestParam Long clientId, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date weekDate) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(mealService.getTrainerClientMeals(username, clientId, weekDate));
    }

    @GetMapping("trainer-meals-day")
    public ResponseEntity<List<MealDTO>> getTrainerClientMealsDay(@RequestParam Long clientId, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dayDate) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(mealService.getTrainerClientMealsDay(username, clientId, dayDate));
    }

    @GetMapping("meal-types")
    public ResponseEntity<List<MealType>> getMealTypes() {
        return ResponseEntity.ok(mealService.getAllMealTypes());
    }

    @PutMapping("update")
    public ResponseEntity<Void> updateMeal(@RequestBody MealDTO mealDTO) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        mealService.updateMeal(username, mealDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> deleteMeal(@RequestParam Long id) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        mealService.deleteMeal(username, id);
        return ResponseEntity.ok().build();
    }

}
