package com.management.employee.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeService {


    private final employeeRepo repo;

    @Autowired
    public employeeService(employeeRepo repo) {
        this.repo = repo;
    }
    public List getEmployees(){
        return repo.findAll();
    }
    public void addEmployee(employee e){
        repo.save(e);
    }
    public void deleteEmployee(int id){
        repo.deleteById(id);
    }
    public employee updateEmployee(int id){
        employee selectedEmp=repo.findById(id).orElseThrow(()->{return new IllegalStateException("account doesn't exist");});
        return selectedEmp;
    }

}
