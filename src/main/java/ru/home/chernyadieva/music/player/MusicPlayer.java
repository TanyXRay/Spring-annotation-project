package ru.home.chernyadieva.music.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.home.chernyadieva.music.genre.Genre;
import ru.home.chernyadieva.music.interface_music.Music;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicMusic;
    private Music rockMusic;
    private Random random = new Random();

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music classicMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(Enum enumClass) {
        String randomElement;
        if (enumClass == Genre.ROCK) {
            randomElement = rockMusic.getSong().get(random.nextInt(rockMusic.getSong().size()));
            return "Playing rock song: " + randomElement;
        } else {
            randomElement = classicMusic.getSong().get(random.nextInt(classicMusic.getSong().size()));
            return "Playing classic song: " + randomElement;
        }
    }
}
