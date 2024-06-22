package com.hmc.his.repository;

import com.hmc.his.model.Pharmacy;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PharmacyRepository {
    List<Pharmacy> selectPharmacies();

    @Select("select pharmacyId from pharmacy")
    List<Integer> selectPharmacyIds();

    @Select("select name from pharmacy")
    List<String> selectPharmacyNames();

    @Select("select * from  pharmacy where pharmacyId=#{pharmacyId}")
    Pharmacy selectPharmacyById(Integer pharmacytId);

    @Insert("insert into  pharmacy(pharmacyId,name) values(#{pharmacyId},#{name})")
    int insertPharmacies(Pharmacy pharmacy);

    @Update("update pharmacy set name=#{name} where pharmacyId=#{pharmacyId}")
    int updatePharmacies(Pharmacy pharmacy);

    @Delete("delete from pharmacy where pharmacyId=#{pharmacyId}")
    int deletePharmacies(Integer id);
}
