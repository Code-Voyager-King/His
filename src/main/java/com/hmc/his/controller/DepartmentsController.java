package com.hmc.his.controller;

import com.hmc.his.model.Department;
import com.hmc.his.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class DepartmentsController {
    private final DepartmentService departmentService;
    public DepartmentsController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }

    @GetMapping("departments")
    public List<Department>  getDepartments(){
        return departmentService.getDepartments();
    }

    @GetMapping("departments/ids")
    public List<Integer> getDepartmentIds(){
        return departmentService.getDepartmentIds();
    }

    @GetMapping("departments/names")
    public List<String> getDepartmentNames(){
        return departmentService.getDepartmentNames();
    }

    @GetMapping("departments/{id}")
    public Department getDepartment(Integer id){
        return departmentService.getDepartment(id);
    }

    @PostMapping("departments")
    public int addDepartments(@RequestBody Department department){
        return departmentService.addDepartments(department);
    }

    @PutMapping("departments")
    public int modifyDepartments(@RequestBody Department department){
        return departmentService.modifyDepartments(department);
    }

    @DeleteMapping("departments/{id}")
    public int removeDepartments(@PathVariable("id") Integer id){
        return departmentService.removeDepartments(id);
    }

}
