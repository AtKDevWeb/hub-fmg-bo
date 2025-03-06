package lol.fmg.hub.models.blog;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@IdClass(ArticleCategoryId.class)
public class ArticleCategory {
    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Id
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

