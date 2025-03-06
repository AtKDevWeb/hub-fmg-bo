package lol.fmg.hub.models.ads;

import lombok.Data;
import java.io.Serializable;

@Data
public class AdsImageRepresentId implements Serializable {
    private Image image;
    private Ads ads;
}
