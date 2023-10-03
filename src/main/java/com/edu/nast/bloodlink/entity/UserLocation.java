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
@Table(name = "user_location")
public class UserLocation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long userLocationId;
@Column(nullable = false, length = 20)
private String longitude;
@Column(nullable = false, length = 20)
private String latitude;
@OneToOne
@JoinColumn(name = "userId")
private Member member;

}
