package com.edu.nast.bloodlink.entity;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberId;
	@Column(nullable = false, length = 20)
	private String firstName;
	@Column( length = 20)
	private String middleName;
	@Column(nullable = false, length = 20)
	private String lastName;
	@Column(nullable = false)
	private Date dateOfBirth;// check whether it is null or not
	private Date lastDonatedDate;
	@Column(nullable = false, length = 5)
    private String  bloodGroup;
	@Column(nullable = false, length = 7)
	private String gender;
	
	@JsonIgnore
	@OneToOne(mappedBy = "member")
	private UserLocation userlocation;
	 @OneToOne
     @JoinColumn( name = "userId")
	 @JsonIgnore
     private UserLogin userlogin;
}
