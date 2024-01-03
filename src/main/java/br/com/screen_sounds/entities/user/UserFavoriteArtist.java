package br.com.screen_sounds.entities.user;

import br.com.screen_sounds.entities.Artist;
import jakarta.persistence.*;

@Entity
public class UserFavoriteArtist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;
}
