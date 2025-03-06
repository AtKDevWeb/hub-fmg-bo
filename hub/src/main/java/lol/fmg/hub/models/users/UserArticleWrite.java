package lol.fmg.hub.models.users;

@Data
@Entity
@IdClass(UserArticleWriteId.class)
public class UserArticleWrite {
    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}