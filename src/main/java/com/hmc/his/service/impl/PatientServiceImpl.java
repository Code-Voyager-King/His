package com.hmc.his.service.impl;

import com.hmc.his.model.Patient;
import com.hmc.his.repository.PatientRepository;
import com.hmc.his.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public List<Patient> getPatients(){
        log.error("error,msg={}", "查询所有病人时出现故障！");
        return patientRepository.selectPatients();
    }
    public List<String> getPatientNames(){
        return patientRepository.selectPatientNames();
    }

    @Override
    public List<String> getPatientDepartmemnts() {
        return patientRepository.selectPatientDepartments();
    }

    public Patient getPatient(Integer id){
        return patientRepository.selectPatientById(id);
    }

    @Override
    public Patient getPatient(String department) {
        return patientRepository.selectPatientByDepartment(department);
    }

    public int addPatients(Patient patient){
        return  patientRepository.insertPatients(patient);
    }

    @Override
    public int removePatients(Integer id) {
        return patientRepository.deletePatients(id);
    }

    @Override
    public int modifyPatients(Patient patient) {
        return patientRepository.updatePatients(patient);
    }

    @Override
    public int addDepartments(Patient patient) {
        return patientRepository.insertDepartments(patient);
    }

    @Override
    public int removeDepartments(String department) {
        return patientRepository.deleteDepartmnets(department);
    }

    @Override
    public int modifyDepartments(Patient patient) {
        return patientRepository.updateDepartments(patient);
    }

    @Override
    public List<String> getPatientHomeaddresses() {
        return patientRepository.selectPatientHomeadresses();
    }

    @Override
    public int addHomeaddresses(Patient patient) {
        return patientRepository.insertHomeaddresses(patient);
    }

    @Override
    public int removeHomeaddresses(String homeaddress) {
        return patientRepository.deleteHomeaddress(homeaddress);
    }

    @Override
    public int modifyHomeaddresses(Patient patient) {
        return patientRepository.updateHomeaddress(patient);
    }

    @Override
    public List<String> getPatientIdcards() {
        return patientRepository.selectPatientIdCards();
    }

    @Override
    public int addIdcards(Patient patient) {
        return patientRepository.insertIdCards(patient);
    }

    @Override
    public int removeIdcards(String idcards) {
        return patientRepository.deleteIdCards(idcards);
    }

    @Override
    public int modifyIdcards(Patient patient) {
        return patientRepository.updateIdCards(patient);
    }

    @Override
    public List<Integer> getPatientAges() {
        return patientRepository.selectPatientAges();
    }

    @Override
    public int addAges(Patient patient) {
        return patientRepository.insertAges(patient);
    }

    @Override
    public int removeAges(Integer age) {
        return patientRepository.deleteAges(age);
    }

    @Override
    public int modifyAges(Patient patient) {
        return patientRepository.updateAges(patient);
    }

}
