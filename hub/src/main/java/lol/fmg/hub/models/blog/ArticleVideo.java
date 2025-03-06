package lol.fmg.hub.models.blog;

import lombok.Data;
import jakarta.persistence.*;

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