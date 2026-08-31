package com.oms.orderinventory.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.oms.orderinventory.dto.request.RegisterRequestDTO;
import com.oms.orderinventory.dto.response.UserResponseDTO;
import com.oms.orderinventory.entity.User;
import com.oms.orderinventory.exception.ResourceAlreadyExistsException;
import com.oms.orderinventory.repository.UserRepository;
import com.oms.orderinventory.service.UserService;
import com.oms.orderinventory.util.ApiResponse;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepo;
	private final PasswordEncoder passwordEncoder;
	
	public UserServiceImpl(UserRepository userRepo, PasswordEncoder passwordEncoder) {
		this.userRepo = userRepo;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Override
	public ApiResponse<UserResponseDTO> registerUser(RegisterRequestDTO userRequest) {
		
		if(userRepo.existsByEmail(userRequest.getEmail())) {
			throw new ResourceAlreadyExistsException("email already registered!");
		}
		
		User user = mapToUserEntity(userRequest); 
		user = userRepo.save(user);
		 
		return ApiResponse.success("User Registered Successfully..", mapUserToResponseDTO(user));
													
	}

	private User mapToUserEntity(RegisterRequestDTO userRequest) {
		return User.builder()
				.name(userRequest.getName())
				.password(passwordEncoder.encode(userRequest.getPassword()))
				.email(userRequest.getEmail())
				.role(userRequest.getRole())
				.build();
	}
	
	private UserResponseDTO mapUserToResponseDTO(User user) {
		return UserResponseDTO.builder()
				.id(user.getId())
				.name(user.getName())
				.email(user.getEmail())
				.role(user.getRole())
				.isActive(user.getIsActive())
				.createdAt(user.getCreatedAt())
				.build();
	}
}
