package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField{
    private String value;

    public CoreCompetency(String value) {
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public String toString() {
        return value;
    }
    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.
}
