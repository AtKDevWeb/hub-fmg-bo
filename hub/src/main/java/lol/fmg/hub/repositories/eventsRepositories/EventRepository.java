package lol.fmg.hub.repositories.eventsRepositories;

import lol.fmg.hub.models.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    // Custom queries can be added here if required
}
