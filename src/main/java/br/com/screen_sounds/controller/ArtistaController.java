package br.com.screen_sounds.controller;

import br.com.screen_sounds.DTOs.ArtistDTO;
import br.com.screen_sounds.services.ArtistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artista")
public class ArtistaController {

    ArtistService artistService = new ArtistService();

    @GetMapping("/{nomeArtista}")
    public ResponseEntity<ArtistDTO> getArtista(@PathVariable String nomeArtista){
        ArtistDTO artista = artistService.buscaArtistaAPI(nomeArtista);
        if (artista == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(artista);
        }
    }
}
