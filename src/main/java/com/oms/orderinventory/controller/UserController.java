package com.oms.orderinventory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.orderinventory.dto.request.RegisterRequestDTO;
import com.oms.orderinventory.dto.response.UserResponseDTO;
import com.oms.orderinventory.service.UserService;
import com.oms.orderinventory.util.ApiResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/register")
	public ResponseEntity<ApiResponse<UserResponseDTO>> register(@Valid @RequestBody RegisterRequestDTO userRegister){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(userService.registerUser(userRegister));
	}
}
