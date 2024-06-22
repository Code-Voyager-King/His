package com.hmc.his.repository;

import com.hmc.his.model.Doctor;
import com.hmc.his.model.Patient;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DoctorRepository {
    List<Doctor> selectDoctors();

    @Select("select proNo from doctor")
    List<String> selectDoctorProNos();

    @Select("select type from doctor")
    List<String> selectDoctorTypes();

    @Select("select name from doctor")
    List<String> selectDoctorNames();

    @Select("select * from doctor where id=#{id}")
    Doctor selectDoctprById(Integer id);

    @Insert("insert into doctor(id, proNo,type,name) values (#{id}, #{proNo},#{type},#{name})")
    int insertDoctors(Doctor doctor);

    @Delete("delete from doctor where id=#{id}")
    int deleteDoctors(Integer id);

    @Update("update doctor set id=#{id},proNo=#{proNo},type=#{type},name=#{name} where id=#{id}")
    int updateDoctors(Doctor doctor);

}
