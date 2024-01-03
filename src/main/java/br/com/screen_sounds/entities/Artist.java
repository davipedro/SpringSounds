package br.com.screen_sounds.entities;

import br.com.screen_sounds.DTOs.ArtistDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "artist")
public class Artist {

    @Id
    @Column(name = "artist_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private long geniusId;
    private String nomeArtista;
    private String descricao;

    @OneToMany(mappedBy = "artist")
    List<Music> music;

    public Artist(){}

    public Artist(ArtistDTO artistDTO){
        geniusId = artistDTO.artista().geniusId();
        nomeArtista = artistDTO.artista().nomeArtista();
        descricao = artistDTO.artista().descricao();
    }

    public long getId() {
        return id;
    }

    public long getGeniusId() {
        return geniusId;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Music> getMusicas() {
        return music;
    }
}
