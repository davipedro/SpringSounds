package com.example.screen_sounds.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoGeniusAPI implements IConsumoAPI{
    @Override
    public String obterDados(String endereco){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://geniuslyrics-api.p.rapidapi.com/search_" + endereco))
                .header("X-RapidAPI-Key", "c55a0c336amsh0fde10a50202700p124624jsn321293c1920d")
                .header("X-RapidAPI-Host", "geniuslyrics-api.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e){
           throw new RuntimeException(e);
        }

        return response.body();
    }
}
