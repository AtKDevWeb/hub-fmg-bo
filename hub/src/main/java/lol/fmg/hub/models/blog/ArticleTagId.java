package lol.fmg.hub.models.blog;

import lombok.Data;
import jakarta.persistence.*;

@Data
public class ArticleTagId implements Serializable {
    private Article article;
    private Tag tag;
}
@Data
@Entity
@IdClass(ArticleTagId.class)
public class ArticleTag {
    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Id
    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;
}