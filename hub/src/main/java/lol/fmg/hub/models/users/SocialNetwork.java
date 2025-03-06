package lol.fmg.hub.models.users;

import jakarta.persistence.*;

@Data
@Entity
public class Socialnetwork {
    @Id
    @GeneratedValue
    private Integer id;
    private String denomination;
    private String urlSrc;
    @OneToMany(mappedBy = "socialnetwork")
    private List<UserSocialnetwork> userSocialnetworkList = new ArrayList<>();
}
