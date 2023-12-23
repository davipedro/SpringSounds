package com.example.screen_sounds.services;

import com.example.screen_sounds.DTOs.ArtistaDTO;

public class ArtistaService {
    private final String urlArtista = "artist?artist=";
    private IConsumoAPI consumoGenius = new ConsumoGeniusAPI();
    private IConverteDados converterDados = new ConverterDados();
    public void pesquisaPorArtista(String nomeArtista){
        nomeArtista = nomeArtista.replace(" ", "%20");
        String endereco = urlArtista + nomeArtista;
        String json = consumoGenius.obterDados(endereco);
        converterDados.obterDados(json, ArtistaDTO.class);
    }
}
