package lol.fmg.hub.models.events;

import jakarta.persistence.*;
import lol.fmg.hub.models.blog.Article;
import lombok.Data;

@Data
@Entity
@IdClass(EventArticleRelatestoId.class)
public class EventArticleRelatesto {

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}