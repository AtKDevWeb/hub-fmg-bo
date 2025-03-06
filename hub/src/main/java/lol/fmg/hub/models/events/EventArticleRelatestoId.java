package lol.fmg.hub.models.events;


import lol.fmg.hub.models.blog.Article;
import lombok.Data;
import java.io.Serializable;

@Data
public class EventArticleRelatestoId implements Serializable {

    private Article article;
    private Event event;

}
