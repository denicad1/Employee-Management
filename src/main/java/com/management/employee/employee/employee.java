package com.management.employee.employee;

import jakarta.persistence.*;

@Entity
@Table
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id")
    @SequenceGenerator(name = "id",sequenceName = "id",allocationSize = 1)
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
    public employee() {
    }

    public employee( String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public employee( String firstName, String email, String department) {
        this.firstName = firstName;
        this.email = email;
        this.department = department;
    }

    public employee(String firstName, String lastName, String email, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }
}
