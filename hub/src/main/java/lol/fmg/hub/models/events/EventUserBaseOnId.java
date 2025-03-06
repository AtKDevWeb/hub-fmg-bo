package lol.fmg.hub.models.events;


import lombok.Data;

import java.io.Serializable;

@Data
public class EventUserBaseOnId implements Serializable {
    private Game game;
    private Event event;
}
