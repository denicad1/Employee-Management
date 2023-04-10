package com.management.employee.department;

import com.management.employee.employee.employee;
import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table
public class department {

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "id")
    @SequenceGenerator(name = "id",sequenceName = "id",allocationSize = 1)
    private int id;

    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<employee> employees;
}
