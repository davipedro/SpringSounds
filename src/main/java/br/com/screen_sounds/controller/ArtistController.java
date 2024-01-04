package br.com.screen_sounds.controller;

import br.com.screen_sounds.DTOs.ArtistDTO;
import br.com.screen_sounds.services.ArtistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    ArtistService artistService = new ArtistService();

    @GetMapping("/{artistName}")
    public ResponseEntity<ArtistDTO> getArtist(@PathVariable String artistName){
        ArtistDTO artist = artistService.searchArtistAPI(artistName);
        if (artist != null){
            return ResponseEntity.ok(artist);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
