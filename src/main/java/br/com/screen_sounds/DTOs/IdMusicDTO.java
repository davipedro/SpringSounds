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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IdMusic {
        @JsonAlias("hits")
        private MusicHit[] musicHits;

        public MusicHit[] getMusicHits(){
            return musicHits;
        }

        public void setMusicHits(MusicHit[] musicHits) {
            this.musicHits = musicHits;
        }

        public IdMusic(){}
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MusicHit {
        @JsonProperty("result")
        private Result result;

        public Result getResult() {
            return result;
        }

        public void setResult(Result result){
            this.result = result;
        }

        public MusicHit(){}
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        @JsonAlias("id")
        private Long id;
        public Long getId(){
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Result(){}
    }

}
