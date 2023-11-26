package com.example.Teme_Spring.CourseCompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    UserService userService;
    TeamService teamService;
    SubjectService subjectService;
    SessionService sessionService;
    ModuleService moduleService;
    LocationService locationService;
    AttendanceService attendanceService;
@Autowired
    public Runner(UserService userService, TeamService teamService, SubjectService subjectService, SessionService sessionService, ModuleService moduleService,
                  LocationService locationService, AttendanceService attendanceService) {
        this.userService = userService;
        this.teamService = teamService;
        this.subjectService = subjectService;
        this.sessionService = sessionService;
        this.moduleService = moduleService;
        this.locationService = locationService;
        this.attendanceService = attendanceService;
    }
    @Override
    public void run(String... args) throws Exception {
    User user = new User("stud","abc","Andrei","Ionescu","andreiio@gmail.com",Role.STUDENT);
    Team team = new Team("Echipa1");
    teamService.addStudentToTeam(1L,user);
    //userService.removeStudentFromTeam(1L);
    }
}
