package lol.fmg.hub.models.events;


import lol.fmg.hub.models.users.User;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventUserContributeId implements Serializable {
    private Integer userId;
    private Integer eventId;
}
