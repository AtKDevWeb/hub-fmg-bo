package lol.fmg.hub.models.ads;

import lombok.Data;
import jakarta.persistence.*;

@Data
public class AdsImageRepresentId implements Serializable {
    private Image image;
    private Ads ads;
}
