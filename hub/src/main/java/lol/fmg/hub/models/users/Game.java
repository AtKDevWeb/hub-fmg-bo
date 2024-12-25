package lol.fmg.hub.models.users;

import jakarta.persistence.*;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column
    private String url_image;
    @Column
    private String url_video;
    @Column
    private String genres;
    @Column
    private String palteformes;
    @Column
    private String summary;
}
