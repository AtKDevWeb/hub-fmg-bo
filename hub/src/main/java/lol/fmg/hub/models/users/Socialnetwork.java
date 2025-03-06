package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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