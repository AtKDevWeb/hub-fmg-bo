package lol.fmg.hub.models.blog;

import lombok.Data;


@Data
public class ArticleCategoryId implements Serializable {
    private Article article;
    private Category category;
}
