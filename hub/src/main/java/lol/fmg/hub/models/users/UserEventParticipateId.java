package lol.fmg.hub.models.users;


import lol.fmg.hub.models.events.Event;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEventParticipateId implements Serializable {

    private Integer user;
    private Integer event;

}
