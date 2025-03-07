package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lol.fmg.hub.models.blog.Article;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(UserArticleWriteId.class)
public class UserArticleWrite {
    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}