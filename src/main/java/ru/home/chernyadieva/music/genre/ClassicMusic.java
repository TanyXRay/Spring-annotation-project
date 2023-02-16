package ru.home.chernyadieva.music.genre;

import org.springframework.stereotype.Component;
import ru.home.chernyadieva.music.interface_music.Music;

@Component
public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Claire the moon";
    }
}