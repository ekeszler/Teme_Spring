package com.example.Teme_Spring.CourseCompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    TeamRepository teamRepository;
    TeamService teamService;
    @Autowired
    public Runner(TeamRepository teamRepository, TeamService teamService) {
        this.teamRepository = teamRepository;
        this.teamService = teamService;
    }



    @Override
    public void run(String... args) throws Exception {
    Team team = new Team("Echipa1");
    teamRepository.save(team);
    User user = new User("stud","abc","Andrei","Ionescu","andreiio@gmail.com",Role.STUDENT);
    teamService.addStudentToTeam(1L,user);
    //userService.removeStudentFromTeam(1L);
    }
}
