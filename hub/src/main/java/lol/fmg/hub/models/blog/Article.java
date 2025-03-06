package lol.fmg.hub.models.blog;

import lol.fmg.hub.models.events.EventArticleRelatesto;
import lol.fmg.hub.models.users.UserArticleWrite;
import lombok.Data;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Article {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    // Content of the article
    @Column(nullable = false)
    @Lob
    private String content;

    // short text to resume the article
    @Column(nullable = false)

    private String synopsis;

    @Column(nullable = false)
    private String statusEnum;

    @OneToMany(mappedBy = "article")
    private List<ArticleVideo> articleVideoList = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    private List<ArticleCategory> articleCategoryList = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    private List<ArticleTag> articleTagList = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    private List<ArticleImage> articleImageList = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    private List<UserArticleWrite> userArticleWriteList = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    private List<EventArticleRelatesto> eventArticleRelatestoList = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    private List<Comment> commentList = new ArrayList<>();
}
