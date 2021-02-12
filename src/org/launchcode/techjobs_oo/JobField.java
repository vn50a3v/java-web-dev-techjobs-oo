package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField
{
 //Combining same fields for the 4 Class
    private int id;
    private static int nextId = 1;
    private String value;


  public JobField() {
        value = "Data not available";
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        if(value != null && !value.isBlank()) this.value = value;
    }

   public void setId(int id) {
        this.id = id;
    }
    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
          return id;
    }


}
