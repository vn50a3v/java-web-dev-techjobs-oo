package org.launchcode.techjobs_oo;

public class JobField
{
 //Combining same fields for the 4 Class

    protected int id;
    protected static int nextId = 1;

    public String getValue() {
        return value;
    }

    private String value;
    //

    public JobField(int id) {
        this.id=id;
           }

    public JobField(String value) {
        this();
        if(value != null && !value.isBlank()) this.value = value;
    }

    public JobField() {
        value = "Data not available";
    }

    public int getId() {
        id=1;
        return id;
    }
    public int ID()
    {
        this.id = nextId;
        nextId++;

      return nextId;
    }


}
