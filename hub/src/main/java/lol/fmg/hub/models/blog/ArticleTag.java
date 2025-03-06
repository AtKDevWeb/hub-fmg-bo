package lol.fmg.hub.models.blog;

import jakarta.persistence.*;
import lombok.Data;

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