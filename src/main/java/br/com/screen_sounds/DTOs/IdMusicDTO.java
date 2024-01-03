package br.com.screen_sounds.DTOs;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO para buscar apenas o id da musica, pois a API (Genius - Song Lyrics)
 * não fornece uma busca pelo nome da musica, necessitando do id para qualquer
 * consulta referente a musica
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdMusicDTO {

    @JsonAlias("hits")
    private MusicaHit[] musicaHits;

    public MusicaHit[] getMusicaHits(){
        return musicaHits;
    }

    public static class MusicaHit {
        @JsonProperty("result")
        private IdMusicDTO.MusicaHit.Result result;

        public IdMusicDTO.MusicaHit.Result getResult() {
            return result;
        }

        public static class Result {
            @JsonAlias("id")
            private Long id;
            public Long getId(){
                return id;
            }
        }
    }

}
