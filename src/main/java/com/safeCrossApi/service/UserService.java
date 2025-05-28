package com.safeCrossApi.service;

import com.safeCrossApi.dto.UserRequestDTO;
import com.safeCrossApi.model.UserModel;

public interface UserService {
    UserModel registerUser(UserRequestDTO requestDTO);
}
