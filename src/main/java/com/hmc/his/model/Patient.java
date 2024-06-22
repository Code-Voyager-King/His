package com.hmc.his.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private Integer id;
    private String name;
    private String department;
    private String homeaddress;
    private String idCard;
    private Integer age;
}
