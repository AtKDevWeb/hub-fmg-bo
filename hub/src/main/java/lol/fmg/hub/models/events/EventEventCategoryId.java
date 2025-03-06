package lol.fmg.hub.models.events;

import lombok.Data;
import java.io.Serializable;

@Data
public class EventEventCategoryId implements Serializable {

    private EventCategory eventCategory;
    private Event event;

}

