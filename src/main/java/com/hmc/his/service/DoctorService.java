package com.hmc.his.service;

import com.hmc.his.model.Doctor;

import java.util.List;

public interface DoctorService {
    public List<Doctor>  getDoctors();
    public List<String> getDoctorProNos();
    public List<String> getDoctorTypes();
    public List<String> getDoctorNames();
    public Doctor getDoctor(Integer id);
    public int addDoctors(Doctor doctor);
    public int removeDoctors(Integer id);
    public int modifyDoctors(Doctor doctor);

}
