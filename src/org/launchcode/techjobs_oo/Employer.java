package org.launchcode.techjobs_oo;

import java.util.Objects;


public class Employer  extends JobField{

    //private String value;
    public Employer(String Value) {
           super(Value);

    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

}
