package lol.fmg.hub.repositories.eventsRepositories;

import lol.fmg.hub.models.events.EventTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTagRepository extends JpaRepository<EventTag, Integer> {
}
