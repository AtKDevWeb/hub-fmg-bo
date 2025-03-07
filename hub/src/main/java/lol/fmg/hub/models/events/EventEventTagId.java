package lol.fmg.hub.models.events;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEventTagId implements Serializable {

    private Integer eventTag;
    private Integer event;

}
