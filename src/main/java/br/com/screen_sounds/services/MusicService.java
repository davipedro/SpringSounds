package br.com.screen_sounds.services;

import br.com.screen_sounds.DTOs.IdMusicDTO;
import br.com.screen_sounds.DTOs.MusicDTO;
import br.com.screen_sounds.exceptions.InvalidID;
import br.com.screen_sounds.geniusAPI.GeniusApiConsume;
import br.com.screen_sounds.geniusAPI.EndPoint;

public class MusicService {
    private final String urlSearch = EndPoint.SEARCH.getEndPoint();
    private final String urlMusicDetails = EndPoint.SONG_DETAILS.getEndPoint();
    private GeniusApiConsume geniusConsume = new GeniusApiConsume();
    private DataConverter dataConverter = new DataConverter();

    public MusicDTO searchMusicAPI(String musicName){
        Long musicID = searchMusicId(musicName);
        return searchMusicDTO(musicID);
    }

    public Long searchMusicId(String musicName){
        musicName = musicName.replace(" ", "%20");
        String address = urlSearch + musicName;
        String json = geniusConsume.getData(address);
        IdMusicDTO.IdMusic idMusicDTO = dataConverter.getData(json, IdMusicDTO.IdMusic.class);
        Long id = idMusicDTO.getMusicHits()[0].getResult().getId();
        System.out.println("id: " + id);
        if (id == null){
            throw new InvalidID("Music ID not found");
        }
        return id;
    }

    public MusicDTO searchMusicDTO(Long musicID){
        String address = urlMusicDetails + musicID;
        String json = geniusConsume.getData(address);
        MusicDTO musicDTO = dataConverter.getData(json, MusicDTO.class);
        System.out.println(musicDTO.musica().dataLancamento());
        System.out.println(musicDTO.musica().descricao());
        System.out.println(musicDTO.musica().lingua());
        System.out.println(musicDTO.musica().geniusId());
        System.out.println(musicDTO.musica().nomeArtistas());
        return musicDTO;
    }

}
