package br.com.screen_sounds.DTOs;

import br.com.screen_sounds.DTOs.subClasses.MusicJson;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MusicDTO (@JsonAlias("song") MusicJson musica){
}


