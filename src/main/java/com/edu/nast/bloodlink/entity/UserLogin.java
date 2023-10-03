package com.edu.nast.bloodlink.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
@Entity
@Table(name = "userlogin")
public class UserLogin {
	@Id   //press ctrl + shift + o for automatically importing packages
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long userId;
	@Column(nullable = false, unique = true)
	private Long phoneNo;
	@Column(nullable = false)
	private String password;
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "middle",
	joinColumns = @JoinColumn(name = "userId", referencedColumnName = "userId"),  // here usrid is primare key of current table 
	inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "roleId")  // here roleId is primary key of UserRole
			)
	private Set<UserRole> userrole = new HashSet<>();
	@JsonIgnore
	@OneToOne( mappedBy = "userlogin")
	private Member member;
	@JsonIgnore
	@OneToOne (mappedBy = "userlogin1")
	private Requester requester;
}
