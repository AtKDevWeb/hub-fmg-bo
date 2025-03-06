package lol.fmg.hub.models.blog;

import lombok.Data;

import java.io.Serializable;


@Data
public class ArticleCategoryId implements Serializable {
    private Article article;
    private Category category;
}
