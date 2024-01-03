package br.com.screen_sounds.DTOs;

import br.com.screen_sounds.DTOs.subClasses.ArtistJson;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ArtistDTO(@JsonAlias("artist") ArtistJson artista){
}
