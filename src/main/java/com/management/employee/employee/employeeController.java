package com.management.employee.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class employeeController {

    private final employeeService empService;

    @Autowired
    public employeeController(employeeService empService) {

        this.empService = empService;
    }
    @GetMapping("/")
    public String empListLandingPage(Model model){
    model.addAttribute("empList",empService.getEmployees());
        return "index";
    }
    @GetMapping("/newEmployee")
    public String addNewEmployee(Model model){
        employee emp= new employee();
        model.addAttribute("newEmp",emp);
        return "newEmployee";

    }
    @PostMapping("/save")
    public String saveNewEmployee(@ModelAttribute("employee") employee emp){
        empService.addEmployee(emp);
        return "redirect:/";

    }
    @GetMapping("/update/{id}")
    public String updateEmp(@PathVariable(value="id") long id,Model model){
        employee emp=empService.updateEmployee((int) id);
        model.addAttribute("employee",emp);
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable(value = "id")long id){
        empService.deleteEmployee((int) id);
        return "redirect:/";
    }
}
