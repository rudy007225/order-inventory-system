package com.oms.orderinventory.service;

import com.oms.orderinventory.dto.request.RegisterRequestDTO;
import com.oms.orderinventory.dto.response.UserResponseDTO;
import com.oms.orderinventory.util.ApiResponse;

public interface UserService {

	ApiResponse<UserResponseDTO> registerUser(RegisterRequestDTO userRequest);
}
