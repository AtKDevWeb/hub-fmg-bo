package lol.fmg.hub.models.ads;

import lol.fmg.hub.models.blog.Video;
import lombok.Data;

import java.io.Serializable;


@Data
public class AdsVideoInsertId implements Serializable {

    private Video video;
    private Ads ads;

}
