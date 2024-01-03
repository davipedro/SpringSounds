package br.com.screen_sounds.geniusAPI;

import br.com.screen_sounds.services.iApiCosume;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoGeniusAPI implements iApiCosume {
    @Override
    public String obterDados(String endereco){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .header("X-RapidAPI-Key", "35607bd394msh129b19fc257ee11p17a002jsn1f3447133dbd")
                .header("X-RapidAPI-Host", "genius-song-lyrics1.p.rapidapi.com")
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
