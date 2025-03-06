package lol.fmg.hub.models.events;


import lol.fmg.hub.models.users.Game;
import lombok.Data;

import java.io.Serializable;

@Data
public class EventUserBaseOnId implements Serializable {
    private Game game;
    private Event event;
}
