package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList;
    @Value("#{${modelname}}")
    private String model;
    @Value("#{${volume}}")
    private int volume;


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public MusicPlayer() {
        musicList = new ArrayList<>();
    }
    public void playMusic() {
        for (Music music : musicList) {
            music.getSong();
        }
    }
    @Autowired
    @Qualifier("classicalMusic")
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void addMusic(Music music) {
        if (musicList == null) musicList = new ArrayList<>();
        musicList.add(music);
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void init() {
        System.out.println("bean created");
    }

    public void destroy() {
        System.out.println("bean destroyed");
    }
}
