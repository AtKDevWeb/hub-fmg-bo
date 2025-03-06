package lol.fmg.hub.models.blog;

import lombok.Data;

import java.io.Serializable;


@Data
public class ArticleImageId implements Serializable {

    private Article article;
    private Image image;

}
