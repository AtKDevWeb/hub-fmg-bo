package lol.fmg.hub.models.blog;


import lombok.Data;

import java.io.Serializable;


@Data
public class ArticleVideoId implements Serializable {
    private Article article;
    private Video video;
}