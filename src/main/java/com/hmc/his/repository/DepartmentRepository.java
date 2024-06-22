package com.hmc.his.repository;

import com.hmc.his.model.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DepartmentRepository {
    List<Department> selectDepartments();

    @Select("select departmentId from department")
    List<Integer> selectDepartmentIds();

    @Select("select name from department")
    List<String> selectDepartmentNames();

    @Select("select * from department where departmentId=#{departmentId}")
    Department selectDepartmentById(Integer departmentId);

    @Insert("insert into  department(departmentId,name) values(#{departmentId},#{name})")
    int insertDeaprtments(Department department);

    @Update("update department set name=#{name} where departmentId=#{departmentId}")
    int updateDepartments(Department department);

    @Delete("delete from department where departmentId=#{departmentId}")
    int deleteDepartments(Integer id);

}
