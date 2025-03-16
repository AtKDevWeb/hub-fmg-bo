package lol.fmg.hub.models.events;

import lombok.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEventCategoryId implements Serializable {

    private Integer eventCategory;
    private Integer event;

}

