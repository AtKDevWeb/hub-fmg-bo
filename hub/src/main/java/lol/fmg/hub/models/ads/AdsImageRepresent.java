package lol.fmg.hub.models.ads;

import lol.fmg.hub.models.blog.Image;
import lombok.*;
import jakarta.persistence.*;

    @Data
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @IdClass(AdsImageRepresentId.class)

public class AdsImageRepresent {
        @Id
        @ManyToOne
        @JoinColumn(name = "image_id")
        private Image image;

        @Id
        @ManyToOne
        @JoinColumn(name = "ads_id")
        private Ads ads;

    }

