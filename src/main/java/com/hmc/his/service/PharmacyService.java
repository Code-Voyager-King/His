package com.hmc.his.service;

import com.hmc.his.model.Department;
import com.hmc.his.model.Pharmacy;

import java.util.List;

public interface  PharmacyService {
    public List<Pharmacy> getPharmacies();
    public List<Integer> getPharmacyIds();
    public List<String> getPharmacyNames();
    public Pharmacy getPharmacy(Integer pharmacyId);
    public int addPharmacies(Pharmacy pharmacy);
    public int removePharmacies(Integer pharmacyId);
    public int modifyPharmacies(Pharmacy pharmacy);
}
