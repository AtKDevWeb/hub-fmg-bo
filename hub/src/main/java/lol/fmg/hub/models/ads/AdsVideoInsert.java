package lol.fmg.hub.models.ads;

import lol.fmg.hub.models.blog.Video;

import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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