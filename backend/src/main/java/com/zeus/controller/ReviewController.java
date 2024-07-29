package com.zeus.controller;

import com.zeus.model.Review;
import com.zeus.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "review")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public ResponseEntity<Review> getPersonalTrainerRating(@RequestParam Long trainerId) {
        return ResponseEntity.ok(reviewService.getPersonalTrainerRating(trainerId));
    }

    @PostMapping()
    public ResponseEntity<Void> ratePersonalTrainer(@RequestParam int rating, @RequestParam Long trainerId) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        reviewService.ratePersonalTrainer(username, trainerId, rating);
        return ResponseEntity.ok().build();
    }

    @GetMapping("already-rated")
    public ResponseEntity<Review> isPersonalTrainerRatedByClient(@RequestParam Long trainerId) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(reviewService.isPersonalTrainerRatedByClient(username, trainerId));
    }
}
