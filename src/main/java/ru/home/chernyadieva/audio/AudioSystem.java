package ru.home.chernyadieva.audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.home.chernyadieva.music.player.MusicPlayer;

import java.util.UUID;

@Component
public class AudioSystem {
    private String id;
    private MusicPlayer musicPlayer;

    @Autowired
    public AudioSystem(MusicPlayer musicPlayer) {
        this.id = UUID.randomUUID().toString();
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return musicPlayer.playMusic();
    }
}
