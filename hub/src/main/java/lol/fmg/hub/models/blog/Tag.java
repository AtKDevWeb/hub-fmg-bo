package lol.fmg.hub.models.blog;

@Data
@Entity
public class Tag {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;
    // Description of the tag
    @Lob
    private String description;
    @OneToMany(mappedBy = "tag")
    private List<ArticleTag> articleTagList = new ArrayList<>();
}