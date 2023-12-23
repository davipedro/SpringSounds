package com.example.screen_sounds.DTOs;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MusicaDTO {
    private String query;
    private List<Hit> hits;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

    public static class Hit {
        private Artist artist;
        private String songTitle;
        private String songTitleWithFeatured;
        private int songID;
        private String songImageURL;
        private SongReleaseDate songReleaseDate;
        private List<String> features;

        public Artist getArtist() {
            return artist;
        }

        public void setArtist(Artist artist) {
            this.artist = artist;
        }

        public String getSongTitle() {
            return songTitle;
        }

        public void setSongTitle(String songTitle) {
            this.songTitle = songTitle;
        }

        public String getSongTitleWithFeatured() {
            return songTitleWithFeatured;
        }

        public void setSongTitleWithFeatured(String songTitleWithFeatured) {
            this.songTitleWithFeatured = songTitleWithFeatured;
        }

        public int getSongID() {
            return songID;
        }

        public void setSongID(int songID) {
            this.songID = songID;
        }

        public String getSongImageURL() {
            return songImageURL;
        }

        public void setSongImageURL(String songImageURL) {
            this.songImageURL = songImageURL;
        }

        public SongReleaseDate getSongReleaseDate() {
            return songReleaseDate;
        }

        public void setSongReleaseDate(SongReleaseDate songReleaseDate) {
            this.songReleaseDate = songReleaseDate;
        }

        public List<String> getFeatures() {
            return features;
        }

        public void setFeatures(List<String> features) {
            this.features = features;
        }
    }

    public static class Artist {
        private String artistName;
        private int artistID;
        private String artistImageUrls;

        public String getArtistName() {
            return artistName;
        }

        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        public int getArtistID() {
            return artistID;
        }

        public void setArtistID(int artistID) {
            this.artistID = artistID;
        }

        public String getArtistImageUrls() {
            return artistImageUrls;
        }

        public void setArtistImageUrls(String artistImageUrls) {
            this.artistImageUrls = artistImageUrls;
        }
    }

    public static class SongReleaseDate {
        private Integer year;
        private Integer month;
        private Integer day;

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public Integer getMonth() {
            return month;
        }

        public void setMonth(Integer month) {
            this.month = month;
        }

        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }
    }
}


