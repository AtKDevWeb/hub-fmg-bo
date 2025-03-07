package lol.fmg.hub.models.events;


import jakarta.persistence.criteria.CriteriaBuilder;
import lol.fmg.hub.models.blog.Article;
import lombok.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventArticleRelatestoId implements Serializable {

    private Integer articleId;
    private Integer eventId;

}
