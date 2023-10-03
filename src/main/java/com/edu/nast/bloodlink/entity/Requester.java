package com.edu.nast.bloodlink.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "reqester")
public class Requester {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long requestId;
@Column(nullable = false)
private Long phoneNo;
@Column(nullable = false)
private int pints;
@Column(nullable = false, length = 5)
String bloodGroup;
@Column(nullable = false, length = 15)
String latitude;
@Column(nullable = false, length = 15)
String longitude;
@OneToOne
@JoinColumn(name = "userId", referencedColumnName = "userId")
private UserLogin userlogin1;

}
