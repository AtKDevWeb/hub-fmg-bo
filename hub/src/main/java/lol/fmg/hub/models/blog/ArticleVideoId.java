package lol.fmg.hub.models.blog;


import lombok.*;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVideoId implements Serializable {

    private Integer article;
    private Integer video;

}