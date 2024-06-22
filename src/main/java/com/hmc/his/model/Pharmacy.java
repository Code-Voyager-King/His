package com.hmc.his.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacy {
    private Integer pharmacyId;//药品id
    private String name;//药品名称
}
