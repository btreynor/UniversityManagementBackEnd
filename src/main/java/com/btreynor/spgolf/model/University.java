package com.btreynor.spgolf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "universities")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String universityName;
    private String universityState;
    private String universityMascot;
    private String universityAddress;
    private String universityAcceptanceRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityState() {
        return universityState;
    }

    public void setUniversityState(String universityState) {
        this.universityState = universityState;
    }

    public String getUniversityMascot() {
        return universityMascot;
    }

    public void setUniversityMascot(String universityMascot) {
        this.universityMascot = universityMascot;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public String getUniversityAcceptanceRate() {
        return universityAcceptanceRate;
    }

    public void setUniversityAcceptanceRate(String universityAcceptanceRate) {
        this.universityAcceptanceRate = universityAcceptanceRate;
    }
}
