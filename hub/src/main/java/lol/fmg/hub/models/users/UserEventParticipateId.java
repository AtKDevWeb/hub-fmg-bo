package lol.fmg.hub.models.users;


import lol.fmg.hub.models.events.Event;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserEventParticipateId implements Serializable {

    private User user;
    private Event event;

}
