package lol.fmg.hub.models.events;


import lol.fmg.hub.models.users.Game;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventUserBaseOnId implements Serializable {
    private Integer gameId;
    private Integer eventId;
}
