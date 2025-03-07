package lol.fmg.hub.models.blog;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tag {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    // Description of the tag
    private String description;

    @OneToMany(mappedBy = "tag")
    private List<ArticleTag> articleTagList = new ArrayList<>();
}