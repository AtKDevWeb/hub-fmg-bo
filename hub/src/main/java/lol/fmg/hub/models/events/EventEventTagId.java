package lol.fmg.hub.models.events;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEventTagId implements Serializable {

    private EventTag eventTag;
    private Event event;

}
