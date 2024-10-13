package com.example.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User.model.User;

public interface ProfileRepository extends JpaRepository<User, Long> {

}
