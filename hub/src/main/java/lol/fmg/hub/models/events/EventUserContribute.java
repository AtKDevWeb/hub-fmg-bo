package lol.fmg.hub.models.events;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@IdClass(EventUserContributeId.class)
public class EventUserContribute {
    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}