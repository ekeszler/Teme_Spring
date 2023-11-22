package com.example.Teme_Spring.CourseCompany;

import com.example.Teme_Spring.CourseCompany.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
