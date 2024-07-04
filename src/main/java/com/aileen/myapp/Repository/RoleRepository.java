package com.aileen.myapp.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aileen.myapp.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
