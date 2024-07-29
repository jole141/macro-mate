package com.zeus.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zeus.dto.UserInfoDTO;
import com.zeus.model.AppUser;
import com.zeus.service.RoleService;
import com.zeus.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = "user")
public class UserController {

    private final UserService userService;
    private final RoleService roleService;

    public UserController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostMapping("/register")
    public ResponseEntity<AppUser> saveUser(@RequestBody AppUser appUser, @RequestParam(name = "role") String roleName) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/user").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(appUser, roleName));
    }

    @GetMapping("/info")
    public ResponseEntity<UserInfoDTO> getUserInfo() {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(userService.getUserInfoByUsername(username));
    }


    @GetMapping("/token/refresh")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String authorizationHeader = request.getHeader(AUTHORIZATION);
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            try {
                String refreshToken = authorizationHeader.substring("Bearer ".length());
                Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
                JWTVerifier verifier = JWT.require(algorithm).build();
                DecodedJWT decodedJWT = verifier.verify(refreshToken);
                String username = decodedJWT.getSubject();
                AppUser appUser = userService.getUserByUsername(username);

                String accessToken = JWT.create()
                        .withSubject(appUser.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                        .withIssuer(request.getRequestURL().toString())
                        .withClaim("roles", List.of(roleService.getRoleById(appUser.getRoleId()).getName()))
                        .sign(algorithm);

                Map<String, String> tokens = new HashMap<>();
                tokens.put("access_token", accessToken);
                tokens.put("refresh_token", refreshToken);
                response.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(), tokens);

            } catch (Exception e) {
                response.setHeader("error", e.getMessage());
                response.setStatus(FORBIDDEN.value());
                Map<String, String> error = new HashMap<>();
                error.put("error_message", e.getMessage());
                response.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(), error);
            }

        } else {
            throw new RuntimeException("Refresh token is missing");
        }
    }

    @PutMapping("/client-info")
    public ResponseEntity<Void> updateClientsInfo(@RequestParam Double height, @RequestParam Double weight) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userService.updateClientsInfo(username, height, weight);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/trainer-info")
    public ResponseEntity<Void> updateTrainersInfo(@RequestParam String description) {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userService.updateTrainersInfo(username, description);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/trainer")
    public ResponseEntity<List<UserInfoDTO>> getAllTrainers() {
        return ResponseEntity.ok(userService.getAllTrainers());
    }

    @GetMapping("/trainers-clients")
    public ResponseEntity<List<UserInfoDTO>> getTrainersClients() {
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(userService.getTrainersClients(username));
    }

}

