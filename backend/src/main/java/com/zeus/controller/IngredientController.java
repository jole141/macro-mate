package com.zeus.controller;

import com.zeus.model.Ingredient;
import com.zeus.service.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "ingredient")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public ResponseEntity<List<Ingredient>> searchIngredient(@RequestParam String search) {
        return ResponseEntity.ok(ingredientService.searchIngredient(search));
    }

    @GetMapping("all")
    public ResponseEntity<String> getAllIngredients() {
        return ResponseEntity.ok("All ingredients");
    }
}
