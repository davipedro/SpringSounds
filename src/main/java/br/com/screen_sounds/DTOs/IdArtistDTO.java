package br.com.screen_sounds.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * DTO para buscar apenas o id do artista, pois a API (Genius - Song Lyrics)
 * não fornece uma busca pelo nome do artista, necessitando do id para qualquer
 * consulta referente ao artista
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdArtistDTO {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IdArtist {
        private ArtistHit[] artistHits;

        public ArtistHit[] getArtistHits() {
            return artistHits;
        }

        public void setHits(ArtistHit[] hits) {
            this.artistHits = hits;
        }

        public IdArtist(){}
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistHit {
        @JsonProperty("result")
        private Result result;

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public ArtistHit(){}
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("primary_artist")
        private PrimaryArtist primaryArtist;

        public PrimaryArtist getPrimaryArtist() {
            return primaryArtist;
        }

        public void setPrimaryArtist(PrimaryArtist primaryArtist) {
            this.primaryArtist = primaryArtist;
        }

        public Result(){}
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PrimaryArtist {

        @JsonProperty("id")
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public PrimaryArtist(){}
    }
}
