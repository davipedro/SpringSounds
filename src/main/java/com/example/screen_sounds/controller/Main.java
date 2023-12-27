package com.example.screen_sounds.controller;

import com.example.screen_sounds.DTOs.MusicaDTO;
import com.example.screen_sounds.services.ArtistaService;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    private ArtistaService artistaService = new ArtistaService();

    private MusicaDTO musicaDTO = new MusicaDTO();

    private MusicaDTO musicaDTO;
    public void menu(){
        int menuOpcao = -1;
        String menuTexto = """
                Bem-vindo ao menu do ScreenSounds!
                Escolha uma das opções abaixo:
                
                1 - Pesquisar por um artista
                2 - Pesquisar por uma música
                0 - Finalizar a aplicação
                """;
        while (menuOpcao != 0){
            switch (menuOpcao){
                case 1:
                    pesquisaPorArtista();
                    break;
                case 2:
                    pesquisaPorMusica();
                    break;
                case 0:
                    System.out.println("Saindo...");
            }
        }
        scanner.close();
    }

    private void pesquisaPorArtista(){
        System.out.println("Informe o nome do artista");
        String nomeArtista = scanner.nextLine();
        artistaService.pesquisaArtistaWeb(nomeArtista);


    }


}
