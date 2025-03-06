package lol.fmg.hub.models.blog;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String title;

    // Content of the comment
    @Column(nullable = false)
    private String body;

    private String status;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}