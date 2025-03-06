package lol.fmg.hub.models.users;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserGameId implements Serializable {

    private User user;
    private Game game;

}

