package lol.fmg.hub.models.blog;

import lombok.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleTagId implements Serializable {

    private Article article;
    private Tag tag;

}

