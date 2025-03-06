package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lol.fmg.hub.models.events.Event;
import lombok.Data;

@Data
@Entity
@IdClass(SupportEventOccursOnId.class)
public class SupportEventOccursOn {

    @Id
    @ManyToOne
    @JoinColumn(name = "support_id")
    private Support support;

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
