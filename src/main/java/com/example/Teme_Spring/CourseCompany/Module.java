package com.example.Teme_Spring.CourseCompany;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Module {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;

    @ManyToOne()
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToMany(mappedBy = "module", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Session> sessions;

    public Module(String name) {
        this.name = name;
    }

    public Module() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", team=" + team +
                ", sessions=" + sessions +
                '}';
    }
}
