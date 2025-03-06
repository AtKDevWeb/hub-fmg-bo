package lol.fmg.hub.models.ads;

import lombok.Data;
import jakarta.persistence.*;

@Data
public class AdsVideoInsertId implements Serializable {
    private Video video;
    private Ads ads;
}
