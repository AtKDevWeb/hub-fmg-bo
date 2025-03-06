package lol.fmg.hub.repositories.eventsRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventTagRepository extends JpaRepository<EventTag, Long> {
    List<EventTag> findByTagContainingIgnoreCase(String tag);
}
