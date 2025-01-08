package lol.fmg.hub.repositories.eventsRepositories;

import lol.fmg.hub.models.events.EventCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventCategoryRepository extends JpaRepository<EventCategory, Long> {
    // Custom queries can be added here if required
}
