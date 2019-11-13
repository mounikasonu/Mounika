package com.mounika.Entities;

import com.mounika.enums.Gender;
import com.mounika.enums.Relationship;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class FamilyMemberDetails {
    @Id

    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Relationship relationship;

    private Long age;

    @Enumerated(EnumType.STRING)

    private Gender gender;

    private Boolean isVerified;

    private Long mobileNumber;


}
