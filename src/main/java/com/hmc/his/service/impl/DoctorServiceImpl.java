package com.hmc.his.service.impl;

import com.hmc.his.model.Doctor;
import com.hmc.his.repository.DoctorRepository;
import com.hmc.his.service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository){
        this.doctorRepository=doctorRepository;
    }

    @Override
    public List<Doctor> getDoctors(){
        log.error("error,msg={}", "查询所有医生时出现故障！");
        return doctorRepository.selectDoctors();
    }

    @Override
    public List<String> getDoctorProNos() {
        return doctorRepository.selectDoctorProNos();
    }

    @Override
    public List<String> getDoctorTypes() {
        return doctorRepository.selectDoctorTypes();
    }

    @Override
    public List<String> getDoctorNames() {
        return doctorRepository.selectDoctorNames();
    }

    @Override
    public Doctor getDoctor(Integer id) {
        return doctorRepository.selectDoctprById(id);
    }

    @Override
    public int addDoctors(Doctor doctor) {
        return doctorRepository.insertDoctors(doctor);
    }

    @Override
    public int removeDoctors(Integer id) {
        return doctorRepository.deleteDoctors(id);
    }

    @Override
    public int modifyDoctors(Doctor doctor) {
        return doctorRepository.updateDoctors(doctor);
    }
}
