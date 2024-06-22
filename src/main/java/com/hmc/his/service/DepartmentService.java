package com.hmc.his.service;

import com.hmc.his.model.Department;
import com.hmc.his.model.Doctor;

import java.util.List;

public interface DepartmentService {
    public List<Department> getDepartments();
    public List<Integer> getDepartmentIds();
    public List<String> getDepartmentNames();
    public Department getDepartment(Integer departmentId);
    public int addDepartments(Department department);
    public int removeDepartments(Integer id);
    public int modifyDepartments(Department department);
}
