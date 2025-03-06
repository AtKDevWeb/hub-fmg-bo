package lol.fmg.hub.models.blog;

@Data
@Entity
public class Video {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private Boolean controle;
    @Column(nullable = false)
    private Boolean autoplay;
    @Column(nullable = false)
    private Boolean loop;
    @Column(nullable = false)
    private Boolean muted;
    @Column(nullable = false)
    private Boolean poster;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private Boolean playinline;
    // description of the video
    @Lob
    private String description;
    private String statusEnum;
    @OneToMany(mappedBy = "video")
    private List<ArticleVideo> articleVideoList = new ArrayList<>();
    @OneToMany(mappedBy = "video")
    private List<AdsVideoInsert> adsVideoInsertList = new ArrayList<>();
}
