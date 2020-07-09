package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        return  "\nID: " + this.getId() +
                "\nName: " + this.getName() +
                "\nEmployer: " + this.getEmployer() +
                "\nLocation: " + this.getLocation() +
                "\nPosition Type: " + this.getPositionType() +
                "\nCore Competency: " + this.getCoreCompetency() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        if(name == "") {
            return "Data not available";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        if(employer.getValue() == "") {
            return new Employer("Data not available");
        }
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        if(location.getValue() == "") {
            return new Location("Data not available");
        }
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        if(positionType.getValue() == "") {
            return new PositionType("Data not available");
        }
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if(coreCompetency.getValue() == "") {
            return new CoreCompetency("Data not available");
        }
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
