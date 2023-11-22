package com.example.Teme_Spring.CourseCompany;

import jakarta.persistence.*;

@Entity
public class Attendance {

    @Id
    @GeneratedValue
    private Long id;

    private boolean attending;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "session_id")
    private Session session;

    public Attendance(boolean attending) {
        this.attending = attending;
    }

    public Attendance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAttending() {
        return attending;
    }

    public void setAttending(boolean attending) {
        this.attending = attending;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", attending=" + attending +
                ", user=" + user +
                ", session=" + session +
                '}';
    }
}
