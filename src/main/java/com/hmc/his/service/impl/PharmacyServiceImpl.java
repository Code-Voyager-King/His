package com.hmc.his.service.impl;

import com.hmc.his.model.Pharmacy;
import com.hmc.his.repository.PharmacyRepository;
import com.hmc.his.service.PharmacyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class PharmacyServiceImpl implements PharmacyService {
    private final  PharmacyRepository pharmacyRepository;
    public PharmacyServiceImpl(PharmacyRepository pharmacyRepository){
        this.pharmacyRepository=pharmacyRepository;
    }
    @Override
    public List<Pharmacy> getPharmacies() {
        log.error("error,msg={}", "查询所有药品时出现故障！");
        return pharmacyRepository.selectPharmacies();
    }

    @Override
    public List<Integer> getPharmacyIds() {
        return pharmacyRepository.selectPharmacyIds();
    }

    @Override
    public List<String> getPharmacyNames() {
        return pharmacyRepository.selectPharmacyNames();
    }

    @Override
    public Pharmacy getPharmacy(Integer pharmacyId) {
        return pharmacyRepository.selectPharmacyById(pharmacyId);
    }

    @Override
    public int addPharmacies(Pharmacy pharmacy) {
        return pharmacyRepository.insertPharmacies(pharmacy);
    }

    @Override
    public int removePharmacies(Integer pharmacyId) {
        return pharmacyRepository.deletePharmacies(pharmacyId);
    }

    @Override
    public int modifyPharmacies(Pharmacy pharmacy) {
        return pharmacyRepository.updatePharmacies(pharmacy);
    }
}
