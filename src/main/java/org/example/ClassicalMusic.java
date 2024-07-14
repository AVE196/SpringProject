package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class ClassicalMusic implements Music{

    public void init() {
        System.out.println("bean cm created");
    }

    public void destroy() {
        System.out.println("bean cm destroyed");
    }
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    @Override
    public void getSong() {
        System.out.println("Play classic music");
    }


}
