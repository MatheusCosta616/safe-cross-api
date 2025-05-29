package com.safeCrossApi.controller;

import com.safeCrossApi.dto.UserRequestDTO;
import com.safeCrossApi.dto.UserResponseDTO;
import com.safeCrossApi.dto.LoginRequestDTO;
import com.safeCrossApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/safecross/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> registerUser(@RequestBody UserRequestDTO requestDTO) {
        UserResponseDTO responseDTO = userService.registerUser(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponseDTO> login(@RequestBody LoginRequestDTO loginDTO) {
        UserResponseDTO responseDTO = userService.login(loginDTO);
        if (responseDTO == null) {
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.ok(responseDTO);
    }
}