package lol.fmg.hub.models.events;

import lombok.Data;

import java.io.Serializable;

@Data
public class EventEventTagId implements Serializable {

    private EventTag eventTag;
    private Event event;

}
