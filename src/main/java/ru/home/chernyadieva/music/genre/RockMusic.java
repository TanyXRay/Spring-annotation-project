package ru.home.chernyadieva.music.genre;

import org.springframework.stereotype.Component;
import ru.home.chernyadieva.music.interface_music.Music;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Boulevard of broken dreams";
    }
}