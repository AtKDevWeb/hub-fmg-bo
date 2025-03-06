package lol.fmg.hub.models.blog;

import lombok.Data;
import jakarta.persistence.*;

@Data
public class ArticleVideoId implements Serializable {
    private Article article;
    private Video video;
}
@Data
@Entity
@IdClass(ArticleVideoId.class)
public class ArticleVideo {
    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Id
    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;
}