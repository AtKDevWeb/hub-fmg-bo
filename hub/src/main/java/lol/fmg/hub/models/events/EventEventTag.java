package lol.fmg.hub.models.events;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(EventEventTagId.class)
public class EventEventTag {

    @Id
    @ManyToOne
    @JoinColumn(name = "event_tag_id")
    private EventTag eventTag;

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}