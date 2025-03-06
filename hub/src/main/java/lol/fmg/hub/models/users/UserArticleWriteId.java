package lol.fmg.hub.models.users;

import lol.fmg.hub.models.blog.Article;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserArticleWriteId implements Serializable {
    private User user;
    private Article article;
}