package br.com.screen_sounds.controller;


import br.com.screen_sounds.DTOs.MusicDTO;
import br.com.screen_sounds.services.MusicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/music")
public class MusicController {

    MusicService musicService = new MusicService();
    @GetMapping("/{musicName}")
    public ResponseEntity<MusicDTO> getMusic(@PathVariable String musicName){
        MusicDTO music = musicService.searchMusicAPI(musicName);
        if (music != null){
            return ResponseEntity.ok(music);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
