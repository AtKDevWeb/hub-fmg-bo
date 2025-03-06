package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@IdClass(UserSocialnetworkId.class)
public class UserSocialnetwork {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Id
    @ManyToOne
    @JoinColumn(name = "socialnetwork_id")
    private Socialnetwork socialnetwork;
}
