package com.example.a11n015.webservi;

public class Hero {

    private  String name;
    private String realname;
    private  String team;
    private  String firstapparance;
    private  String createdby;
    private  String publisher;
    private  String imageur1;
    private  String bio;

    public Hero(String name, String realname, String team, String firstapparance, String createdby, String publisher, String imageur1, String bio) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstapparance = firstapparance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageur1 = imageur1;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstapparance() {
        return firstapparance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageur1() {
        return imageur1;
    }

    public String getBio() {
        return bio;
    }
}
