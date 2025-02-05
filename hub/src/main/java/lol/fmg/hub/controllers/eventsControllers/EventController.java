package lol.fmg.hub.controllers.eventsControllers;

import lol.fmg.hub.models.events.Event;
import lol.fmg.hub.repositories.eventsRepositories.EventRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    // CRUD
    // Create
    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        Event savedEvent = eventRepository.save(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEvent);
    }

    // ReadAll
    @GetMapping
    public ResponseEntity<List<Event>> getEvents() {
        List<Event> events = eventRepository.findAll();
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByTitleContaining
    @GetMapping("/search-terms")
    public ResponseEntity<List<Event>> getEventsByTitleContaining(@RequestParam String searchTerms) {
        List<Event> events = eventRepository.findAllByTitleContainingIgnoreCase(searchTerms);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByTitleContaining
    @GetMapping("/search-termsInDescription")
    public ResponseEntity<List<Event>> getEventsByDescriptionContaining(@RequestParam String searchTermsInDescription) {
        List<Event> events = eventRepository.findAllByDescriptionContainingIgnoreCase(searchTermsInDescription);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }
    // ReadAllByStatus
    @GetMapping("/search-status")
    public ResponseEntity<List<Event>> getEventsByStatus(@RequestParam String searchStatus) {
        List<Event> events = eventRepository.findAllByStatus(searchStatus);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByAllByStartDate
    @GetMapping("/search-StartDate")
    public ResponseEntity<List<Event>> getEventsByStartDate(@RequestParam LocalDateTime searchStartDate) {
        List<Event> events = eventRepository.findAllByStartDate(searchStartDate);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByAllByStartDateBetween
    @GetMapping("/search-startDateBetween")
    public ResponseEntity<List<Event>> getEventsByStartDateBetween(@RequestParam LocalDateTime startDate, LocalDateTime endDate) {
        List<Event> events = eventRepository.findAllByStartDateBetween(startDate, endDate);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByStartDateAfter
    @GetMapping("/search-startDateAfter")
    public ResponseEntity<List<Event>> getEventsByStartDateAfter(@RequestParam LocalDateTime searchStartDateAfter) {
        List<Event> events = eventRepository.findAllByStartDateAfter(searchStartDateAfter);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByAllByStartDateBefore
    @GetMapping("/search-startDateBefore")
    public ResponseEntity<List<Event>> getEventsByStartDateBefore(@RequestParam LocalDateTime searchStartDateBefore) {
        List<Event> events = eventRepository.findAllByStartDateBefore(searchStartDateBefore);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByAllByEnfDate
    @GetMapping("/search-EndDate")
    public ResponseEntity<List<Event>> getEventsByEndDate(@RequestParam LocalDateTime searchEndDate) {
        List<Event> events = eventRepository.findAllByEndDate(searchEndDate);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByAllByStartDateBetween
    @GetMapping("/search-EndDateBetween")
    public ResponseEntity<List<Event>> getEventsByEndDateBetween(@RequestParam LocalDateTime endDate, LocalDateTime endDate2) {
        List<Event> events = eventRepository.findAllByEndDateBetween(endDate, endDate2);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByEndDateAfter
    @GetMapping("/search-endDateAfter")
    public ResponseEntity<List<Event>> getEventsByEndDateAfter(@RequestParam LocalDateTime searchEndDateAfter) {
        List<Event> events = eventRepository.findAllByEndDateAfter(searchEndDateAfter);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByAllByEndDateBefore
    @GetMapping("/search-endDateBefore")
    public ResponseEntity<List<Event>> getEventsByEndDateBefore(@RequestParam LocalDateTime searchEndDateBefore) {
        List<Event> events = eventRepository.findAllByEndDateBefore(searchEndDateBefore);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadAllByAllByLocation
    @GetMapping("/search-byLocation")
    public ResponseEntity<List<Event>> getEventsByLocation(@RequestParam String searchByLocation) {
        List<Event> events = eventRepository.findAllByLocation(searchByLocation);
        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(events);
    }

    // ReadOneByID
    @GetMapping("/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable Long id) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(event);
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event updatedEvent) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event == null) {
            return ResponseEntity.notFound().build();
        }
        Event savedEvent = eventRepository.save(updatedEvent);
        return ResponseEntity.ok(savedEvent);
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event == null) {
            return ResponseEntity.notFound().build();
        }
        eventRepository.delete(event);
        return ResponseEntity.noContent().build();
    }
}
