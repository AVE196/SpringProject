package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class JavaConfigurationContext {

    @Bean
    @Scope("prototype")
    public ElectricSystem electricStation() {
        return new ElectricSystem();
    }

    @Bean
    @Scope("prototype")
    public PipelineSystem pipelineStation() {
        return new PipelineSystem();
    }
//    @Bean
//    @Scope("prototype")
//    public IndustrialDistrict industrialDistrict() {
//        return new IndustrialDistrict();
//    }

    @Bean
    public CityDistrict cityDistrict() {
        return new CityDistrict();
    }

    @Bean
    public CityDistrict cityDistrict2() {
        return new CityDistrict();
    }

    @Bean
    public City city() {
        return new City("city");
    }

}
