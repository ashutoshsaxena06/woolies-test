package com.api.enrolment.student.dto;

public class Student {
    private String firstName;
    private String lastName;
    private String nationality;
    private String id;
    private String className;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClass(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student [firstName = " + firstName + ", lastName = " + lastName + ", nationality = " + nationality + ", id = " + id + ", className = " + className + "]";
    }
}
