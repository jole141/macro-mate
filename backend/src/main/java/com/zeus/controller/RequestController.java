package com.zeus.controller;

import com.zeus.dto.UserInfoDTO;
import com.zeus.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "request")
public class RequestController {

    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public ResponseEntity<List<UserInfoDTO>> getTrainersRequests() {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(requestService.getTrainersRequests(username));
    }

    @PostMapping("/send")
    public ResponseEntity<Void> sendRequest(@RequestParam Long trainerId) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        requestService.sendRequest(username, trainerId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/accept")
    public ResponseEntity<Void> acceptRequest(@RequestParam Long clientId) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        requestService.acceptRequest(username, clientId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/decline")
    public ResponseEntity<Void> declineRequest(@RequestParam Long clientId) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        requestService.declineRequest(username, clientId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/quit")
    public ResponseEntity<Void> quitMembership(@RequestParam Long userId) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        requestService.quitMembership(username, userId);
        return ResponseEntity.ok().build();
    }

}
