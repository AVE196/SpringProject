package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Music cm = context.getBean("classicalMusic", Music.class);
        cm.getSong();
        MusicPlayer player = context.getBean(MusicPlayer.class);
//        MusicPlayer playerTwo = context.getBean(MusicPlayer.class);
////        playerTwo.setVolume(10);
////
////
        player.playMusic();
        System.out.println(player.getVolume());
        System.out.println(player.getModel());
        System.out.println(STR."Model player is \{player.getModel()}");
        System.out.println(STR."Volume on \{player.getVolume()}");


//
//        System.out.println(STR."Model player is \{playerTwo.getModel()}");
//        System.out.println(STR."Volume on \{playerTwo.getVolume()}");

        context.close();
    }
}
