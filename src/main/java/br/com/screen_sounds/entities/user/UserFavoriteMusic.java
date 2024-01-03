package br.com.screen_sounds.entities.user;

import br.com.screen_sounds.entities.Music;
import jakarta.persistence.*;

@Entity
public class UserFavoriteMusic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "music_id", nullable = false)
    private Music music;
}
