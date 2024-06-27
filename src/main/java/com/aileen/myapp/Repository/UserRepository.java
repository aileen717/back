package com.aileen.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aileen.myapp.Model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
