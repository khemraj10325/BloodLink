package com.edu.nast.bloodlink.entity;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "user_role")
public class UserRole {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int roleId;
@Column(nullable = false, unique = true, length = 5)   // yesle length max set garxa varchar(255) in MySQL
private String role;
@Column(nullable = false, unique = true, length = 15)
private String roleName;
@ManyToMany(mappedBy = "userrole")
private Set<UserLogin> usrlogin = new HashSet<>();
}
