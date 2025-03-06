package lol.fmg.hub.models.ads;

import lombok.Data;

@Data
public class AdsImageRepresentId implements Serializable {
    private Image image;
    private Ads ads;
}
