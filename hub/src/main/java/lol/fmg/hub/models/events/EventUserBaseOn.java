package lol.fmg.hub.models.events;

import lol.fmg.hub.models.users.Game;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(EventUserBaseOnId.class)
public class EventUserBaseOn {
    @Id
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
