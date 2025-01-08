package lol.fmg.hub.repositories.eventsRepositories;

import lol.fmg.hub.models.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    Event findByTitle(String title);

    List<Event> findAllByTitleContainingIgnoreCase(String termsTitle);
    List<Event> findAllByDescriptionContainingIgnoreCase(String termsTitle);

    List<Event> findAllByStatus(String status);

    List<Event> findAllByStartDate(Date startDate);
    List<Event> findAllByStartDateBetween(Date startDate, Date startDate2);
    List<Event> findAllByStartDateAfter(Date startDateAfter);
    List<Event> findAllByStartDateBefore(Date startDateBefore);

    List<Event> findAllByEndDate(Date EndDate);
    List<Event> findAllByEndDateBetween(Date startDate, Date endDate);
    List<Event> findAllByEndDateAfter(Date endDateAfter);
    List<Event> findAllByEndDateBefore(Date endDateDateBefore);

    List<Event> findByLocation(String location);

}
