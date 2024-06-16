package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class CityDistrict {

    @Autowired
    private ElectricSystem electricSystem;
    @Autowired
    private PipelineSystem pipelineSystem;
    @Autowired(required = false)
    private IndustrialDistrict industrialDistrict;


    @Override
    public String toString() {
        return STR."CityDistrict{electricSystem=\{electricSystem}, pipelineSystem=\{pipelineSystem}, industrialDistrict=\{industrialDistrict}\{'}'}";
    }
}
