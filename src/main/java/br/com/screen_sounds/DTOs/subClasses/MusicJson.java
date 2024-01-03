package br.com.screen_sounds.DTOs.subClasses;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MusicJson(@JsonAlias("id") Long geniusId,
                        @JsonAlias("artist_names") String nomeArtistas,
                        @JsonAlias("description_preview") String descricao,
                        @JsonAlias("full_title") String nomeMusica,
                        @JsonAlias("language") String lingua,
                        @JsonAlias("release_date") LocalDate dataLancamento){
}
