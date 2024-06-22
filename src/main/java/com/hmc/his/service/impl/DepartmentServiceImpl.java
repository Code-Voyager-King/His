package com.hmc.his.service.impl;


import com.hmc.his.model.Department;
import com.hmc.his.model.Doctor;
import com.hmc.his.repository.DepartmentsRepository;
import com.hmc.his.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentsRepository departmentsRepository ;

    public DepartmentServiceImpl(DepartmentsRepository departmentsRepository){
        this.departmentsRepository=departmentsRepository;
    }
    public List<Department> getDepartments(){
        log.error("error,msg={}", "查询所有部门时出现故障！");
        return departmentsRepository.selectDepartments();
    }
    public List<Integer> getDepartmentIds(){
        return departmentsRepository.selectDepartmentIds();
    }
    public List<String> getDepartmentNames(){
        return departmentsRepository.selectDepartmentNames();
    }
    public Department getDepartment(Integer departmentId){
        return departmentsRepository.selectDepartmentById(departmentId);
    }
    public int addDepartments(Department department){
        return  departmentsRepository.insertDeaprtments(department);
    }
    public int removeDepartments(Integer id){
        return departmentsRepository.deleteDepartments(id);
    }
    public int modifyDepartments(Department department){
        return departmentsRepository.updateDepartments(department);
    }
}
