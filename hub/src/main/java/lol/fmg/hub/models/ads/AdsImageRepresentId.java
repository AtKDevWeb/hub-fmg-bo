package lol.fmg.hub.models.ads;

import lol.fmg.hub.models.blog.Image;
import lombok.Data;
import java.io.Serializable;

@Data
public class AdsImageRepresentId implements Serializable {

    private Image image;
    private Ads ads;

}
