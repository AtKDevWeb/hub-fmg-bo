package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Socialnetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String denomination;
    private String urlSrc;

    @OneToMany(mappedBy = "socialnetwork")
    private List<UserSocialnetwork> userSocialnetworkList = new ArrayList<>();

}