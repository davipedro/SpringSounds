package com.example.screen_sounds.DTOs;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ArtistaDTO(@JsonAlias("artistName") String artista,
                         @JsonAlias("artistID") int geniusID,
                         @JsonAlias("description") String descricao) {
}
