package com.demorestapi.bean;

public class Student {

    private String FirstName;
    private String LastName;
    private int ID;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Student(String firstName, String lastName, int ID) {
        FirstName = firstName;
        LastName = lastName;
        this.ID = ID;
    }
}
