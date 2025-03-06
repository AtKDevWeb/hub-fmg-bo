package lol.fmg.hub.models.events;


import lol.fmg.hub.models.users.User;
import lombok.Data;

import java.io.Serializable;

@Data
public class EventUserContributeId implements Serializable {
    private User user;
    private Event event;
}
