package com.example.Teme_Spring.CourseCompany;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    TeamRepository teamRepository;
    UserRepository userRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository, UserRepository userRepository) {
        this.teamRepository = teamRepository;
        this.userRepository = userRepository;
    }

    public Team addStudentToTeam (Long teamId, User user){
        Team team = teamRepository.findById(teamId).orElseThrow(() -> new EntityNotFoundException("id not found"));
        team.getParticipants().add(user);
        return teamRepository.save(team);
    }


}
