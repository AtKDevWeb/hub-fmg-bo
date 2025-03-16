package lol.fmg.hub.models.blog;

import lombok.*;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

