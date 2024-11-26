package com.tx.entities;

import java.io.Serializable;
import java.util.Objects;

public class Job implements Serializable {
    private int jobNo;
    private String jobTitle;
    private String description;
    private String location;
    private String designation;
    private double salary;

    public int getJobNo() {
        return jobNo;
    }

    public void setJobNo(int jobNo) {
        this.jobNo = jobNo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return jobNo == job.jobNo && Double.compare(salary, job.salary) == 0 && Objects.equals(jobTitle, job.jobTitle) && Objects.equals(description, job.description) && Objects.equals(location, job.location) && Objects.equals(designation, job.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobNo, jobTitle, description, location, designation, salary);
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobNo=" + jobNo +
                ", jobTitle='" + jobTitle + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

