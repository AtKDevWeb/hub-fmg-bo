package lol.fmg.hub.models.users;

import jakarta.persistence.*;

@Entity
public class SocialNetwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String url_Logo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl_Logo() {
        return url_Logo;
    }

    public void setUrl_Logo(String url_Logo) {
        this.url_Logo = url_Logo;
    }
}
