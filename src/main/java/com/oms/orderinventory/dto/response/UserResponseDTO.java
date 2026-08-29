package com.oms.orderinventory.dto.response;

import java.time.LocalDateTime;

import com.oms.orderinventory.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserResponseDTO {

	private Long id;
	private String name;
	private String email;
	private Role role;
	private Boolean isActive;
	private LocalDateTime createdAt;

}
