package org.launchcode.techjobs_oo;

import java.sql.SQLOutput;
import java.util.Objects;

public class Job extends JobField {
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private boolean hasStarted;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        id = nextId;
        name = "Data not available";
        hasStarted = false;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        if(name !=null && !name.isBlank())this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        hasStarted = true;
    }

    @Override
    public String toString (){

        if(!hasStarted) return "OOPS! This job does not seem to exist.";

        String JOB = "\nID: " + this.id + "\n";
        JOB += "Name" + ": " + this.name + "\n";
        JOB += "Employer" + ": " + this.getEmployer() + "\n";
        JOB += "Location" + ": " + this.getLocation() + "\n";
        JOB += "Position Type" + ": " + this.getPositionType() + "\n";
        JOB += "Core Competency" + ": " + this.getCoreCompetency() + "\n";
        JOB += "\n";
        return JOB;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
