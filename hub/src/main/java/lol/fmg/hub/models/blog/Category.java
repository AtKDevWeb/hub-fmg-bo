package lol.fmg.hub.models.blog;


import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    // Description of the category
    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "category")
    private List<ArticleCategory> articleCategoryList = new ArrayList<>();
}