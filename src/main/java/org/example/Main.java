package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigurationContext.class);
        City city = applicationContext.getBean(City.class);
//        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(JavaConfigurationContext.class);
//
//        City city2 = applicationContext2.getBean(City.class);

        System.out.println(city);
//        System.out.println(city2);
    }
}