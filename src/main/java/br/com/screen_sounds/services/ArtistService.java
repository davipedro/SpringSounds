package br.com.screen_sounds.services;

import br.com.screen_sounds.geniusAPI.ConsumoGeniusAPI;
import br.com.screen_sounds.DTOs.ArtistDTO;
import br.com.screen_sounds.DTOs.IdArtistDTO;
import br.com.screen_sounds.exceptions.InvalidID;
import br.com.screen_sounds.geniusAPI.EndPoint;

public class ArtistService {
    private final String urlSearch = EndPoint.SEARCH.getEndPoint();
    private final String urlArtistDetails = EndPoint.ARTIST_DETAILS.getEndPoint();
    private ConsumoGeniusAPI consumoGenius = new ConsumoGeniusAPI();
    private DataConverter converterDados = new DataConverter();
    public ArtistDTO buscaArtistaAPI(String nomeArtista){
        Long idDoArtista = buscaIdArtista(nomeArtista);
        return buscaArtistaDTO(idDoArtista);
    }

    private Long buscaIdArtista(String nomeArtista){
        nomeArtista = nomeArtista.replace(" ", "%20");
        String endereco = urlSearch + nomeArtista;
        String json = consumoGenius.obterDados(endereco);
        IdArtistDTO.IdDTO idArtistDTO = converterDados.obterDados(json, IdArtistDTO.IdDTO.class);
        Long id = idArtistDTO.getHits()[0].getResult().getPrimaryArtist().getId();
        if (id == null){
            throw new InvalidID("O ID do artista não pode ser encontrado");
        }
        return id;
    }

    private ArtistDTO buscaArtistaDTO(Long idDoArtista){
        String endereco = urlArtistDetails + idDoArtista;
        String json = consumoGenius.obterDados(endereco);
        ArtistDTO artistDTO = converterDados.obterDados(json, ArtistDTO.class);
        return artistDTO;
    }

    private void addArtistaFav(){

    }
}
