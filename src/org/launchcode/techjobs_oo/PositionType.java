package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField{
    private String value;
    public PositionType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    // TODO: Add a custom toString() method that returns the data stored in 'value'.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return this.getId() == that.getId();
    }

    @Override
    public String toString() {
        return value;
    }
// TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when

}
