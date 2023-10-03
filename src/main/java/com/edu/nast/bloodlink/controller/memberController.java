package com.edu.nast.bloodlink.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.nast.bloodlink.entity.Member;
import com.edu.nast.bloodlink.repository.memberRepository;

@RestController
@RequestMapping("/member")
public class memberController {
	@Autowired
	private memberRepository memberRepo;
	
	@GetMapping("/{id}")
	public Optional<Member> displayMember(@PathVariable("id")Long id)
	{     System.out.println("\n\\n\n\\n\n\n\n\n");
		return (memberRepo.findById(id));
	}
	@GetMapping
	public List<Member> displayAll()
	{
		return memberRepo.findAll();
	}
	
	@PostMapping
	public Member createMember(@RequestBody Member member)
	{
		return memberRepo.save(member);
	}

}
