package com.oms.orderinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oms.orderinventory.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	 boolean existsByEmail(String email);

}



