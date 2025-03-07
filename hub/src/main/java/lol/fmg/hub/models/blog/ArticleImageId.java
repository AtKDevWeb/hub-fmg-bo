package lol.fmg.hub.models.blog;

import lombok.*;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class ArticleImageId implements Serializable {

    private Integer articleId;
    private Integer imageId;

}
