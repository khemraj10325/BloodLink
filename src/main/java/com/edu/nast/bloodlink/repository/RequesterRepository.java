package com.edu.nast.bloodlink.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.nast.bloodlink.entity.Requester;

public interface RequesterRepository extends JpaRepository<Requester,Long> {

}
