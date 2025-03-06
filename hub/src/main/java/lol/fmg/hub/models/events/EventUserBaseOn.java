package lol.fmg.hub.models.events;


import jakarta.persistence.*;
import lombok.Data;

@Data
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
