package lol.fmg.hub.models.events;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(EventEventCategoryId.class)
public class EventEventCategory {

    @Id
    @ManyToOne
    @JoinColumn(name = "event_category_id")
    private EventCategory eventCategory;

    @Id
    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
