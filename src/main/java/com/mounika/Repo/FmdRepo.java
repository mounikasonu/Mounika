package com.mounika.Repo;

import com.mounika.Entities.FamilyMemberDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FmdRepo extends JpaRepository<FamilyMemberDetails,Long> {
}
