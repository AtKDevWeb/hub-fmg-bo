package lol.fmg.hub.models.blog;

import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String url_src;
    @Column
    private String alt;
    @Column(nullable = false)
    private String title;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl_src() {
        return url_src;
    }

    public void setUrl_src(String url_src) {
        this.url_src = url_src;
    }
}
