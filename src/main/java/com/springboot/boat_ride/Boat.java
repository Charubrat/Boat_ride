package com.springboot.boat_ride;

import jakarta.persistence.*;

@Entity
@Table(name = "boats")
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "boat_id", nullable = false)
    public Long boatId;
    @Column(name = "boat_name")
    public String boatName;
    @Column(name = "operating_ghat")
    public String operatingGhat;
    @Column(name = "boat_type")
    public String boatType;
    @Column(name = "description")
    public String description;
    @Column(name = "owner_id")
    public String ownerId;
    @Column(name = "skipper1_id")
    public String skipper1Id;
    @Column(name = "skipper2_id")
    public String skipper2Id;
    @Column(name = "capacity")
    public Integer capacity;

}

