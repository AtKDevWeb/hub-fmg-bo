package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lol.fmg.hub.models.events.Event;
import lombok.Data;

@Data
@Entity
@IdClass(UserEventParticipateId.class)
public class UserEventParticipate {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}