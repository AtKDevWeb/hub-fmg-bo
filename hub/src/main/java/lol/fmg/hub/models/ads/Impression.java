package lol.fmg.hub.models.ads;

@Data
@Entity
public class Impression {
    @Id
    @GeneratedValue
    private Integer id;
    // duration in second
    private Integer duration;
    @Column(nullable = false)
    private String targetUrl;
    @ManyToOne
    @JoinColumn(name = "id")
    private Ads ads;
}
