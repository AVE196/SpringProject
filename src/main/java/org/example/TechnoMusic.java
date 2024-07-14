package org.example;

import org.springframework.stereotype.Component;

@Component
public class TechnoMusic implements Music{
    @Override
    public void getSong() {
        System.out.println("Play techno music");
    }
}
