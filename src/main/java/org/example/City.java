package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class City {

    @Autowired
    private List<CityDistrict> cityDistrictList;
    private String name;


    @Override
    public String toString() {
        return STR."City{cityDistrictList=\{cityDistrictList}, name='\{name}\{'\''}\{'}'}";
    }

    public City(String name) {
        this.name = name;
    }

}
