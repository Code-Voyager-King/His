package com.hmc.his.service;

import com.hmc.his.model.Doctor;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DoctorServiceTest {

    @Autowired
    private DoctorService doctorService;

    @Test
    @Order(1)
    void addDoctors() {
        int i=doctorService.addDoctors(new Doctor(999,"测试","普通专家","测试999号"));
        assertEquals(1,i);
    }

    @Test
    @Order(2)
    void modifyDoctors() {
        int i=doctorService.modifyDoctors(new Doctor(999,"测试-m","普通专家-m","测试999号-m"));
        assertEquals(1,i);
    }

    @Test
    @Order(3)
    void getDoctors() {
        int i=doctorService.getDoctors().size();
        assertEquals(1,i);
    }

    @Test
    @Order(4)
    void getDoctorProNos() {
        String proNo=doctorService.getDoctorProNos().stream().findFirst().orElse("");
        assertEquals("测试-m",proNo);
    }

    @Test
    @Order(5)
    void getDoctorTypes() {
        String type=doctorService.getDoctorTypes().stream().findFirst().orElse("");
        assertEquals("普通专家-m",type);
    }

    @Test
    @Order(6)
    void getDoctorNames() {
        String name=doctorService.getDoctorNames().stream().findFirst().orElse("");
        assertEquals("测试999号-m",name);
    }

    @Test
    @Order(7)
    void getDoctor() {
        var doctor= doctorService.getDoctor(999);
        assertEquals("测试999号-m", doctor.getName());
    }

    @Test
    @Order(8)
    void removeDoctors() {
        int i=doctorService.removeDoctors(999);
        assertEquals(1,i);
    }

}