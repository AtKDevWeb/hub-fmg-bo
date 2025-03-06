package lol.fmg.hub.models.ads;

import lol.fmg.hub.models.blog.Video;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@IdClass(AdsVideoInsertId.class)
public class AdsVideoInsert {

    @Id
    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    @Id
    @ManyToOne
    @JoinColumn(name = "ads_id")
    private Ads ads;

}