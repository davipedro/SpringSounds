package br.com.screen_sounds.DTOs.subClasses;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ArtistJson(@JsonAlias("id") Long geniusId,
                         @JsonAlias("name") String nomeArtista,
                         @JsonAlias("description_preview") String descricao){
}
