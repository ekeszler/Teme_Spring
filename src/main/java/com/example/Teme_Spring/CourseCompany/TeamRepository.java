package com.example.Teme_Spring.CourseCompany;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

   Team findById(long id);

   // Team findAllBy(Long id);
    Team save(Long id);
}
