package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public void getSong() {
        System.out.println("Play rock music");
    }
}
