package lol.fmg.hub.models.blog;

import lombok.Data;
import java.io.Serializable;


@Data
public class ArticleTagId implements Serializable {
    private Article article;
    private Tag tag;
}

