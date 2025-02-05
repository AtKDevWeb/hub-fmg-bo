package lol.fmg.hub.repositories.eventsRepositories;

import lol.fmg.hub.models.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    Event findByTitle(String title);

    List<Event> findAllByTitleContainingIgnoreCase(String termsTitle);
    List<Event> findAllByDescriptionContainingIgnoreCase(String termsTitle);

    List<Event> findAllByStatus(String status);

    List<Event> findAllByStartDate(LocalDateTime startDate);
    List<Event> findAllByStartDateBetween(LocalDateTime startDate, LocalDateTime startDate2);
    List<Event> findAllByStartDateAfter(LocalDateTime startDateAfter);
    List<Event> findAllByStartDateBefore(LocalDateTime startDateBefore);

    List<Event> findAllByEndDate(LocalDateTime EndDate);
    List<Event> findAllByEndDateBetween(LocalDateTime endDate, LocalDateTime endDate2);
    List<Event> findAllByEndDateAfter(LocalDateTime endDateAfter);
    List<Event> findAllByEndDateBefore(LocalDateTime endDateDateBefore);

    List<Event> findAllByLocation(String location);

}
