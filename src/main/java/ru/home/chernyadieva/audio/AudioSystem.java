package ru.home.chernyadieva.audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.home.chernyadieva.music.player.MusicPlayer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class AudioSystem {
    private MusicPlayer musicPlayer;

    @Value("${audioSystem.id}")
    private String id;

    @Value("${audioSystem.volume}")
    private int volume;

    @Autowired
    public AudioSystem(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @PostConstruct
    private void doInit(){
        System.out.println("Initialization beans");
    }
    @PreDestroy
    private void doDestroy(){
        System.out.println("Destroy beans");
    }

    public String getId() {
        return id;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return musicPlayer.playMusic() + "\nvolume: " + volume + "\nid: " + id;
    }
}
