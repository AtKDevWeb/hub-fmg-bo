package lol.fmg.hub.repositories.eventsRepositories;

import lol.fmg.hub.models.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
