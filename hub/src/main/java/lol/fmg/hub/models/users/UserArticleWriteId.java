package lol.fmg.hub.models.users;

import lol.fmg.hub.models.blog.Article;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserArticleWriteId implements Serializable {
    private Integer user;
    private Integer article;
}