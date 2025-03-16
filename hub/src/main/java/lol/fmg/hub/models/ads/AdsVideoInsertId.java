package lol.fmg.hub.models.ads;

import lol.fmg.hub.models.blog.Video;
import lombok.*;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdsVideoInsertId implements Serializable {

    private Integer video;
    private Integer ads;

}
