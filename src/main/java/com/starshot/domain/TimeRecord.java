package com.starshot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TimeRecord {

    @Id
    @GeneratedValue
    private int id;
    private String employeeName;
    private Date timeIn;
    private Date timeOut;
    private Boolean active;

    public TimeRecord(String employeeName) {
        this.employeeName = employeeName;
    }

    public TimeRecord(String employeeName, Date timeIn, Date timeOut, Boolean active) {
        this.employeeName = employeeName;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.active = active;
    }

    public TimeRecord() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
