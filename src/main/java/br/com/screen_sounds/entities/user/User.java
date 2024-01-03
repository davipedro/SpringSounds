package br.com.screen_sounds.entities.user;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ss_user")
public class User{
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //username
    //password

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserFavoriteMusic> favoriteMusics = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserFavoriteArtist> favoriteArtists = new ArrayList<>();

}
