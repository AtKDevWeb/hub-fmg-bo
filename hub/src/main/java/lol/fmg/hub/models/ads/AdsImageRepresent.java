package lol.fmg.hub.models.ads;

import lol.fmg.hub.models.blog.Image;
import lombok.Data;
import jakarta.persistence.*;

    @Data
    @Entity
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

