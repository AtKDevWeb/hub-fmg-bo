package lol.fmg.hub.models.events;


import lol.fmg.hub.models.blog.Article;
import lombok.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventArticleRelatestoId implements Serializable {

    private Article article;
    private Event event;

}
