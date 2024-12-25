package lol.fmg.hub.models.users;

import jakarta.persistence.*;

@Entity
public class Support {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String denomination;
    @Column
    private String slug;
    @Column
    private String description;
    @Column
    private String url_imageLogo;

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl_imageLogo() {
        return url_imageLogo;
    }

    public void setUrl_imageLogo(String url_imageLogo) {
        this.url_imageLogo = url_imageLogo;
    }
}
