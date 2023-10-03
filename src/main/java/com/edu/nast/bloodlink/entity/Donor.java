package com.edu.nast.bloodlink.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "donor")
public class Donor {
private boolean status ;
@ManyToOne
@Id
@JoinColumn(name = "memberId", referencedColumnName = "memberId")
private Member member1;
@ManyToOne
@Id
@JoinColumn(name = "requestId", referencedColumnName = "requestId")
private Requester requester;

}
