package br.com.screen_sounds.entities;

import java.util.Arrays;

public enum FavoriteCategory {
    ARTIST,
    MUSIC;

    public static boolean isValidCategory(String category){
        return Arrays.stream(values())
                .anyMatch(c -> c.name().equals(category));
    }
}
