package lol.fmg.hub.repositories.eventsRepositories;

import lol.fmg.hub.models.events.EventCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventCategoryRepository extends JpaRepository<EventCategory, Integer> {
}
