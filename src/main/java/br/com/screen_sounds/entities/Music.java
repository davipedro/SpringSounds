package br.com.screen_sounds.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "music")
public class Music {

    @Id
    @Column(name = "music_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long geniusId;
    private String nomeArtistas;
    private String descricao;
    private String nomeMusica;
    private String lingua;
    private LocalDate dataLancamento;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Music(){}

//    public Music(MusicDTO musicDTO){
//        this.geniusId = musicDTO.getMusica().getId();
//        this.nomeArtistas = musicDTO.getMusica().getNomeArtistas();
//        this.descricao = musicDTO.getMusica().getDescricao();
//        this.nomeMusica = musicDTO.getMusica().getNomeMusica();
//        this.lingua = musicDTO.getMusica().getLingua();
//        this.dataLancamento = musicDTO.getMusica().getDataLancamento();
//    }

    public long getId() {
        return id;
    }

    public long getGeniusId() {
        return geniusId;
    }

    public String getNomeArtistas() {
        return nomeArtistas;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public String getLingua() {
        return lingua;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public Artist getArtista() {
        return artist;
    }
}
