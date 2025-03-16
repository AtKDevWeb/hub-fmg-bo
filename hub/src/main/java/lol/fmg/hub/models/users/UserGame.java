package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(UserGameId.class)
public class UserGame {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

}
