package com.edu.nast.bloodlink.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.nast.bloodlink.entity.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {

}
