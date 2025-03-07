package lol.fmg.hub.models.users;

import lol.fmg.hub.models.events.Event;
import lombok.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupportEventOccursOnId implements Serializable {

    private Integer support;
    private Integer event;

}