package com.example.Teme_Spring.CourseCompany;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void removeStudentFromTeam(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("id not found"));
        userRepository.delete(user);

    }
}
