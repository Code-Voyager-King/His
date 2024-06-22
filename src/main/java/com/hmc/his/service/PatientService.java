package com.hmc.his.service;

import com.hmc.his.model.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> getPatients();
    public List<String> getPatientNames();
    public Patient getPatient(Integer id);
    public Patient getPatient(String department);
    public int addPatients(Patient patient);
    public int removePatients(Integer id);
    public int modifyPatients(Patient patient);

    public List<String> getPatientDepartmemnts();

    //添加部门
    public int addDepartments(Patient patient);

    //根据部门删除patient
    public int removeDepartments(String department);

    //更新部门
    public int modifyDepartments(Patient patient);

    public List<String> getPatientHomeaddresses();

    //添加地址
    public int addHomeaddresses(Patient patient);

    //根据地址删除patient
    public int removeHomeaddresses(String homeaddress);

    //更新地址
    public int modifyHomeaddresses(Patient patient);

    public List<String> getPatientIdcards();

    //添加身份证
    public int addIdcards(Patient patient);

    //根据身份证删除patient
    public int removeIdcards(String idcards);

    //更新身份证
    public int modifyIdcards(Patient patient);

    public List<Integer> getPatientAges();

    //添加年龄
    public int addAges(Patient patient);

    //根据年龄证删除patient
    public int removeAges(Integer age);

    //更新年龄
    public int modifyAges(Patient patient);

}
