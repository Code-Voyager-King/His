package com.hmc.his.controller;

import com.hmc.his.model.Patient;
import com.hmc.his.service.PatientService;
import com.hmc.his.config.PulsarConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.pulsar.client.api.*;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class PatientController {
    private final  PatientService patientService;
    private final  PulsarConfig  pulsarConfig;

    public PatientController(PatientService patientService, PulsarConfig pulsarConfig){
        this.patientService = patientService;
        this.pulsarConfig=pulsarConfig;
    }

    @GetMapping("patients")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }

    @GetMapping("patients/names")
    public List<String> getPatientNames(){
        return patientService.getPatientNames();
    }

    @Cacheable(value = "patients", key = "#id")
    @GetMapping("patients/{id}")
    public Patient getPatient(@PathVariable("id") Integer id){
        return patientService.getPatient(id);
    }


    @CachePut(value = "patients", key = "#patient.id")
    @PostMapping("patients")
    public int addPatients(@RequestBody Patient patient){
        return patientService.addPatients(patient);
    }

    @CacheEvict(value = "patients", key = "#id")
    @DeleteMapping("patients/{id}")
    public int removePatients(@PathVariable("id")Integer id){
        return patientService.removePatients(id);
    }

    @CacheEvict(value = "patients", key = "#patient.id")
    @PutMapping("patients")
    public int modifyPatients(@RequestBody Patient patient){
        return patientService.modifyPatients(patient);
    }

    @GetMapping("/patients/sendMsg")
    public MessageId sendMsg(String msg) throws PulsarClientException {
        PulsarClient pulsarFactory = pulsarConfig.pulsarFactory();
        Producer<byte[]> producer1 = pulsarFactory.newProducer()
                .topic("his-topic")
                .create();
        return producer1.send(msg.getBytes());
    }

    @GetMapping("/patients/consumer")
    public String consumerByArtificial() throws PulsarClientException {
        PulsarClient pulsarFactory = pulsarConfig.pulsarFactory();
        Consumer<byte[]> consumer = pulsarFactory.newConsumer()
                .topic("his-topic")
                .subscriptionName("his-subscription")
                .subscribe();
        Message<byte[]> receive = consumer.receive();
        String data = new String(receive.getData());
        log.info(data);
        consumer.acknowledge(receive);
        consumer.close();
        return data;
    }

    @GetMapping("hello")
    public String getHello(){
        System.out.println("hello word!");
        return "hello";
    }

    @GetMapping("1")
    public String get1(){
        return "1";
    }

    @GetMapping("2")
    public String get2(){
        return "2";
    }

    @GetMapping("3")
    public String get3(){
        return "3";
    }

    @GetMapping("4")
    public String get4(){
        return "4";
    }

    @GetMapping("5")
    public String get5(){
        return "5";
    }

    @GetMapping("6")
    public String get6(){
        return "6";
    }

    @GetMapping("7")
    public String get7(){
        return "7";
    }

    @GetMapping("8")
    public String get8(){
        return "8";
    }

    @GetMapping("9")
    public String get9(){
        return "9";
    }

    @GetMapping("10")
    public String get10(){
        return "10";
    }

    @GetMapping("11")
    public String get11(){
        return "11";
    }

    @GetMapping("12")
    public String get12(){
        return "12";
    }

    @GetMapping("13")
    public String get13(){
        return "13";
    }

    @GetMapping("14")
    public String get14(){
        return "14";
    }

    @GetMapping("15")
    public String get15(){
        return "15";
    }

    @GetMapping("16")
    public String get16(){
        return "16";
    }

    @GetMapping("patients/department/{department}")
    public Patient getPatient(@PathVariable("department") String department){
        return patientService.getPatient(department);
    }

    @GetMapping("patients/departments")
    public List<String> getPatientDepartmnets(){
        return patientService.getPatientDepartmemnts();
    }

    @PostMapping("patients/department")
    public int addDepartments(@RequestBody Patient patient){
        return patientService.addDepartments(patient);
    }

    @DeleteMapping("patients/department/{department}")
    public int removeDepartments(@PathVariable("department")String  department){
        return patientService.removeDepartments(department);
    }

    @PutMapping("patients/department")
    public int modifyDepartments(@RequestBody Patient patient){
        return patientService.modifyDepartments(patient);
    }

    @GetMapping("patients/homeaddress")
    public List<String> getPatienthomeaddresses(){
        return patientService.getPatientHomeaddresses();
    }

    @PostMapping("patients/homeaddress")
    public int addHomeaddress(@RequestBody Patient patient){
        return patientService.addHomeaddresses(patient);
    }

    @DeleteMapping("patients/homeaddress/{homeaddress}")
    public int removeHomeaddresses(@PathVariable("homeaddress")String  homeaddress){
        return patientService.removeHomeaddresses(homeaddress);
    }

    @PutMapping("patients/homeaddress")
    public int modifyHomeaddress(@RequestBody Patient patient){
        return patientService.modifyHomeaddresses(patient);
    }

    @GetMapping("patients/idCards")
    public List<String> getPatientIdcards(){
        return patientService.getPatientIdcards();
    }

    @PostMapping("patients/idCard")
    public int addIdCards(@RequestBody Patient patient){
        return patientService.addIdcards(patient);
    }

    @DeleteMapping("patients/idCard/{idCard}")
    public int removeIdCards(@PathVariable("idCard")String idCard){
        return patientService.removeIdcards(idCard);
    }

    @PutMapping("patients/idCard")
    public int modifyIdCards(@RequestBody Patient patient){
        return patientService.modifyIdcards(patient);
    }

    @GetMapping("patients/ages")
    public List<Integer> getPatientAges(){
        return patientService.getPatientAges();
    }

    @PostMapping("patients/ages")
    public int addAges(@RequestBody Patient patient){
        return patientService.addAges(patient);
    }

    @DeleteMapping("patients/age/{ages}")
    public int removeAges(@PathVariable("ages")Integer ages){
        return patientService.removeAges(ages);
    }

    @PutMapping("patients/ages")
    public int modifyAges(@RequestBody Patient patient){
        return patientService.modifyAges(patient);
    }


}
