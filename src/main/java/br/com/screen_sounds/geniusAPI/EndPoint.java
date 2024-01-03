package br.com.screen_sounds.geniusAPI;

public enum EndPoint {
    SEARCH("https://genius-song-lyrics1.p.rapidapi.com/search/?q="),
    ARTIST_DETAILS("https://genius-song-lyrics1.p.rapidapi.com/artist/details/?id="),
    SONG_DETAILS("https://genius-song-lyrics1.p.rapidapi.com/song/details/?id=");

    private final String url;

    EndPoint(String url){
        this.url = url;
    }

    public String getEndPoint(){
        return url;
    }
}
