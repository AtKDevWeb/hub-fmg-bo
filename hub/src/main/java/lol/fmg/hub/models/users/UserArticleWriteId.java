package lol.fmg.hub.models.users;

@Data
public class UserArticleWriteId implements Serializable {
    private User user;
    private Article article;
}