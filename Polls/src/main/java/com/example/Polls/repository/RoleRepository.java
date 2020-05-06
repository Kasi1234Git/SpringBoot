package com.example.Polls.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Polls.model.Role;
import com.example.Polls.model.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByName(RoleName roleName);

}
