package ru.home.chernyadieva.audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.home.chernyadieva.music.genre.Genre;
import ru.home.chernyadieva.music.player.MusicPlayer;

@Component
public class AudioSystem {
    private MusicPlayer musicPlayer;

    @Autowired
    public AudioSystem(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return musicPlayer.playMusic(Genre.ROCK) +
                "\n" + musicPlayer.playMusic(Genre.CLASSICAL);
    }
}
