package com.edu.nast.bloodlink.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.nast.bloodlink.entity.Member;

public interface memberRepository extends JpaRepository<Member , Long>{

}
