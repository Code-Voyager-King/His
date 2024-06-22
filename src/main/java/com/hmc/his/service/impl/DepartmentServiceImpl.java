package com.hmc.his.service.impl;


import com.hmc.his.model.Department;
import com.hmc.his.repository.DepartmentRepository;
import com.hmc.his.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository ;

    public DepartmentServiceImpl(DepartmentRepository departmentsRepository){
        this.departmentRepository=departmentsRepository;
    }
    public List<Department> getDepartments(){
        log.error("error,msg={}", "查询所有部门时出现故障！");
        return departmentRepository.selectDepartments();
    }
    public List<Integer> getDepartmentIds(){
        return departmentRepository.selectDepartmentIds();
    }
    public List<String> getDepartmentNames(){
        return departmentRepository.selectDepartmentNames();
    }
    public Department getDepartment(Integer departmentId){
        return departmentRepository.selectDepartmentById(departmentId);
    }
    public int addDepartments(Department department){
        return  departmentRepository.insertDeaprtments(department);
    }
    public int removeDepartments(Integer id){
        return departmentRepository.deleteDepartments(id);
    }
    public int modifyDepartments(Department department){
        return departmentRepository.updateDepartments(department);
    }
}
