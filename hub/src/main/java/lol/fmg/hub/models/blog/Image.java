package lol.fmg.hub.models.blog;

import jakarta.persistence.*;
import lol.fmg.hub.models.ads.AdsImageRepresent;
import lol.fmg.hub.models.users.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue
    private Integer id;

    private String urlSource;
    private String title;

    // description of the image
    private String description;
    private String alt;
    private String statusEnum;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "image")
    private List<ArticleImage> articleImageList = new ArrayList<>();

    @OneToMany(mappedBy = "image")
    private List<AdsImageRepresent> adsImageRepresentList = new ArrayList<>();
}
