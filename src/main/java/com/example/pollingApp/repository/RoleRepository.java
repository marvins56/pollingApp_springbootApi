package com.example.pollingApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pollingApp.model.Role;
import com.example.pollingApp.model.RoleName;
@Repository
public interface RoleRepository  extends JpaRepository<Role, Long>{
	
	 Optional<Role> findByName(RoleName roleName);

}
