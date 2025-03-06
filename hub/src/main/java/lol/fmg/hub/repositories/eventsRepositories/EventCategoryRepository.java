package lol.fmg.hub.repositories.eventsRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventCategoryRepository extends JpaRepository<EventCategory, Long> {
    // Custom queries can be added here if required
}
