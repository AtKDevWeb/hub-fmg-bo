package lol.fmg.hub.models.users;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGameId implements Serializable {

    private User user;
    private Game game;

}

