package lol.fmg.hub.models.ads;

import lombok.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdsImageRepresentId implements Serializable {

    private Integer imageId;
    private Integer adsId;

}

