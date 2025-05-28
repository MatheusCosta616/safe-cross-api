package com.safeCrossApi.service.impl;

import com.safeCrossApi.dto.UserRequestDTO;
import com.safeCrossApi.model.UserModel;
import com.safeCrossApi.repository.UserRepository;
import com.safeCrossApi.service.UserService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao hashear a senha", e);
        }
    }

    @Override
    public UserModel registerUser(UserRequestDTO requestDTO){
        UserModel user = new UserModel();
        user.setName(requestDTO.getName());
        user.setEmail(requestDTO.getEmail());
        user.setPasswordHash(hashPassword(requestDTO.getPassword()));
        user.setRegistrationDate(LocalDateTime.now());
        user.setDeviceId(requestDTO.getDeviceId());

        return userRepository.save(user);
    }
}
