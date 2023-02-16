package ru.home.chernyadieva.music.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.home.chernyadieva.music.genre.ClassicMusic;
import ru.home.chernyadieva.music.genre.RockMusic;

@Component
public class MusicPlayer {
    private ClassicMusic classicMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing classic: " + classicMusic.getSong() +
                "\nPlaying rock: " + rockMusic.getSong();
    }
}
