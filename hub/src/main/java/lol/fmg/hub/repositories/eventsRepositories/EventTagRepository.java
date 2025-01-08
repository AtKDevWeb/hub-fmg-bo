package lol.fmg.hub.repositories.eventsRepositories;

import lol.fmg.hub.models.events.EventTag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventTagRepository extends JpaRepository<EventTag, Long> {
    // Custom queries can be added here if required
}
