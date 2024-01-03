package br.com.screen_sounds.services;

import br.com.screen_sounds.geniusAPI.GeniusApiConsume;
import br.com.screen_sounds.DTOs.ArtistDTO;
import br.com.screen_sounds.DTOs.IdArtistDTO;
import br.com.screen_sounds.exceptions.InvalidID;
import br.com.screen_sounds.geniusAPI.EndPoint;

public class ArtistService {
    private final String urlSearch = EndPoint.SEARCH.getEndPoint();
    private final String urlArtistDetails = EndPoint.ARTIST_DETAILS.getEndPoint();
    private GeniusApiConsume geniusConsume = new GeniusApiConsume();
    private DataConverter dataConverter = new DataConverter();
    public ArtistDTO searchArtistAPI(String artistName){
        Long artistID = searchIdArtist(artistName);
        return searchArtistDTO(artistID);
    }

    private Long searchIdArtist(String artistName){
        artistName = artistName.replace(" ", "%20");
        String address = urlSearch + artistName;
        String json = geniusConsume.getData(address);
        IdArtistDTO.IdArtist idArtistDTO = dataConverter.getData(json, IdArtistDTO.IdArtist.class);
        Long id = idArtistDTO.getArtistHits()[0].getResult().getPrimaryArtist().getId();
        if (id == null){
            throw new InvalidID("Artist ID not found");
        }
        return id;
    }

    private ArtistDTO searchArtistDTO(Long artistID){
        String address = urlArtistDetails + artistID;
        String json = geniusConsume.getData(address);
        return dataConverter.getData(json, ArtistDTO.class);
    }

    private void addFavoriteArtist(){

    }
}
