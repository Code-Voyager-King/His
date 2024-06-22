package com.hmc.his.controller;

import com.hmc.his.model.Department;
import com.hmc.his.model.Pharmacy;
import com.hmc.his.service.DepartmentService;
import com.hmc.his.service.PharmacyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class PharmacyController {
    private final PharmacyService pharmacyService;
    public PharmacyController(PharmacyService pharmacyService){
        this.pharmacyService=pharmacyService;
    }
    @GetMapping("pharmacies")
    public List<Pharmacy> getPharmacies(){
        return pharmacyService.getPharmacies();
    }

    @GetMapping("pharmacies/ids")
    public List<Integer> getPharmacyIds(){
        return pharmacyService.getPharmacyIds();
    }

    @GetMapping("pharmacies/names")
    public List<String> getPharmacyNames(){
        return pharmacyService.getPharmacyNames();
    }

    @GetMapping("pharmacies/{id}")
    public Pharmacy getPharmacy(Integer id){
        return pharmacyService.getPharmacy(id);
    }

    @PostMapping("pharmacies")
    public int addPharmacies(@RequestBody Pharmacy pharmacy){
        return pharmacyService.addPharmacies(pharmacy);
    }

    @PutMapping("pharmacies")
    public int modifyDepartments(@RequestBody Pharmacy pharmacy){
        return pharmacyService.modifyPharmacies(pharmacy);
    }

    @DeleteMapping("pharmacies/{id}")
    public int removeDepartments(@PathVariable("id") Integer id){
        return pharmacyService.removePharmacies(id);
    }

    @GetMapping("units")
    public String getUnit(){
        return "unit";
    }

    @GetMapping("sellingPrices")
    public String getSellingPrice(){
        return "sellingPrice";
    }

    @GetMapping("produceDates")
    public String getProduceDate(){
        return "produceDate";
    }
}
