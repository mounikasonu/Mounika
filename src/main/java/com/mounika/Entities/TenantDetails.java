package com.mounika.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
public class TenantDetails {
    @javax.persistence.Id
    private Long Id;

    private Long mobileNumber;

    private String adress;

    private Long adharnumber;

    private Boolean isVerified;

    private Long countOfFamilyMembers;




}
