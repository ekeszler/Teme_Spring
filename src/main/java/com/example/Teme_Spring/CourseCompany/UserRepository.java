package com.example.Teme_Spring.CourseCompany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> removeUserById(Long id);

    List<User> save(Long id);

}
