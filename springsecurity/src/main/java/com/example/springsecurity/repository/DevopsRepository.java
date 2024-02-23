package com.example.springsecurity.repository;

import com.example.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevopsRepository extends JpaRepository<User, Integer> {
}
