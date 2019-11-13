package com.mounika.Repo;

import com.mounika.Entities.TenantDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantDetailsRepo extends JpaRepository<TenantDetails,Long> {
}
