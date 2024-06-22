package com.hmc.his.controller;

import com.hmc.his.model.Doctor;
import com.hmc.his.service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class DoctorController {
    private  final DoctorService doctorService;

    public DoctorController(DoctorService doctorService){
        this.doctorService=doctorService;
    }

    @GetMapping("doctors")
    public List<Doctor> getDoctors(){
        return doctorService.getDoctors();
    }

    @GetMapping("doctors/proNos")
    public List<String> getDoctorProNos(){
        return doctorService.getDoctorProNos();
    }

    @GetMapping("doctors/types")
    public List<String> getDoctorTypes(){
        return doctorService.getDoctorTypes();
    }
    @GetMapping("doctors/names")
    public List<String> getDoctorNames(){
        return doctorService.getDoctorNames();
    }

    @GetMapping("doctors/{id}")
    public Doctor getDoctor(@PathVariable ("id") Integer id){
        return doctorService.getDoctor(id);
    }

    @PostMapping("doctors")
        public int addDoctors(@RequestBody Doctor doctor){
        return doctorService.addDoctors(doctor);
    }

    @DeleteMapping("doctors/{id}")
    public int  removeDoctors(@PathVariable("id") Integer id){
        return doctorService.removeDoctors(id);
    }
    @PutMapping("doctors")
    public int modifyDoctors(@RequestBody Doctor doctor){
        return doctorService.modifyDoctors(doctor);
    }
}
