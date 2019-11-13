package com.mounika.Repo;

import com.mounika.Entities.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDORepo extends JpaRepository<Todos,Long> {
}
