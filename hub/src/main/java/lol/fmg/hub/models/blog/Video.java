package lol.fmg.hub.models.blog;

import jakarta.persistence.*;
import lol.fmg.hub.models.ads.AdsVideoInsert;
import lol.fmg.hub.models.enums.StatusEnum;
import lol.fmg.hub.models.enums.VideoEnumType;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Video {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private Boolean controle;

    @Column(nullable = false)
    private Boolean autoplay;

    @Column(nullable = false)
    private Boolean loop;

    @Column(nullable = false)
    private Boolean muted;

    @Column(nullable = false)
    private Boolean poster;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VideoEnumType typeEnum;

    @Column(nullable = false)
    private Boolean playinline;

    // description of the video
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusEnum statusEnum;

    @OneToMany(mappedBy = "video")
    private List<ArticleVideo> articleVideoList = new ArrayList<>();
    @OneToMany(mappedBy = "video")
    private List<AdsVideoInsert> adsVideoInsertList = new ArrayList<>();
}
