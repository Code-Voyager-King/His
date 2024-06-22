package com.hmc.his.repository;

import com.hmc.his.model.Patient;
import org.apache.ibatis.annotations.*;
import org.apache.pulsar.shade.org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface PatientRepository {
    List<Patient> selectPatients();
    @Select("select name from patient")
    List<String> selectPatientNames();

    @Select("select * from patient where id = #{id}")
    Patient selectPatientById(Integer id);

    @Select("select * from patient where department=#{department} ")
    Patient  selectPatientByDepartment(String department);

    @Insert("insert into patient(id, name,department,homeaddress,idCard,age) values (#{id}, #{name},#{department},#{homeaddress},#{idCard},#{age})")
    int insertPatients(Patient patient);

    @Delete("delete from patient where id=#{id}")
    int deletePatients(Integer id);

    @Update("update patient set id=#{id},name=#{name},department=#{department},homeaddress=#{homeaddress},idCard=#{idCard},age=#{age} where id=#{id}")
    int updatePatients(Patient patient);

    @Select("select department from patient")
    List<String> selectPatientDepartments();

    // 添加部门
    @Insert("insert into patient(department) values(#{department})")
    int insertDepartments(Patient patient);

    //根据部门删除
    @Delete("delete  from patient where department=#{department}")
    int deleteDepartmnets(String department);

    //更新部门
    @Update("update patient set department=#{department} where id=#{id}")
    int updateDepartments(Patient patient);

    @Select("select homeadress from patient")
    List<String> selectPatientHomeadresses();

    // 添加地址
    @Insert("insert into patient(homeaddress) values(#{homeaddress})")
    int insertHomeaddresses(Patient patient);

    //根据地址删除
    @Delete("delete  from patient where homeaddress=#{homeaddress}")
    int deleteHomeaddress(String homeadress);

    //更新地址
    @Update("update patient set homeaddress=#{homeaddress} where id=#{id}")
    int updateHomeaddress(Patient patient);

    @Select("select idCard from patient")
    List<String> selectPatientIdCards();

    // 添加身份证
    @Insert("insert into patient(idCard) values(#{idCard})")
    int insertIdCards(Patient patient);

    //根据身份证删除
    @Delete("delete  from patient where idCard=#{idCard}")
    int deleteIdCards(String idCard);

    //更新身份证
    @Update("update patient set idCard=#{idCard} where id=#{id}")
    int updateIdCards(Patient patient);

    @Select("select age from patient")
    List<Integer> selectPatientAges();

    // 添加年龄
    @Insert("insert into patient(age) values(#{age})")
    int insertAges(Patient patient);

    //根据年龄证删除
    @Delete("delete  from age where idCard=#{age}")
    int deleteAges(Integer age);

    //更新年龄
    @Update("update patient set idCard=#{age} where id=#{age}")
    int updateAges(Patient patient);
}
