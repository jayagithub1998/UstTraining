package com.example.User.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
