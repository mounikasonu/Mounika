package com.mounika.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String  tenAntName;

    private String passWord;

    @OneToOne(cascade = CascadeType.PERSIST)
    private TenantDetails tenantDetails;

    @OneToMany
    private List<FamilyMemberDetails> familyMemberDetails=new ArrayList<>();


}
