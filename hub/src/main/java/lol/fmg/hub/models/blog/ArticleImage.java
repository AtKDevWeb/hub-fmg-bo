package lol.fmg.hub.models.blog;

@Data
@Entity
@IdClass(ArticleImageId.class)
public class ArticleImage {
    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Id
    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;
}
