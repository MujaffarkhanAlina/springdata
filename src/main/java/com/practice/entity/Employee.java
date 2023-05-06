package com.practice.entity;

import javax.persistence.*;

import java.util.Date;

@Entity(name="Employee")

public class Employee {

    @Column(name = "id")
    @Id
    private int EmployeeId;
    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;
    @Column(name ="reg_date")
    private Date timeStamp;

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

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

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

}
