package lol.fmg.hub.models.users;

import lol.fmg.hub.models.events.Event;
import lombok.Data;
import java.io.Serializable;

@Data
public class SupportEventOccursOnId implements Serializable {

    private Support support;
    private Event event;

}