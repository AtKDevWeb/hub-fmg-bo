package lol.fmg.hub.controllers.eventsControllers;

import lol.fmg.hub.models.events.EventTag;
import lol.fmg.hub.repositories.eventsRepositories.EventTagRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventTags")
public class EventTagController {
    private final EventTagRepository eventTagRepository;

    public EventTagController(EventTagRepository eventTagRepository) {
        this.eventTagRepository = eventTagRepository;
    }

    // CRUD
    // Create
    @PostMapping
    public ResponseEntity<EventTag> createEventTag(@RequestBody EventTag eventTag) {
        EventTag savedEventTag = eventTagRepository.save(eventTag);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEventTag);
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<EventTag>> getEventTags() {
        List<EventTag> eventTags = eventTagRepository.findAll();
        if (eventTags.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(eventTags);
    }

    // Read One By ID
    @GetMapping("/{id}")
    public ResponseEntity<EventTag> getEventTag(@PathVariable Long id) {
        EventTag eventTag = eventTagRepository.findById(id).orElse(null);
        if (eventTag == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(eventTag);
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<EventTag> updateEventTag(@PathVariable Long id, @RequestBody EventTag updatedEventTag) {
        EventTag eventTag = eventTagRepository.findById(id).orElse(null);
        if (eventTag == null) {
            return ResponseEntity.notFound().build();
        }
        EventTag savedEventTag = eventTagRepository.save(updatedEventTag);
        return ResponseEntity.ok(savedEventTag);
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEventTag(@PathVariable Long id) {
        EventTag eventTag = eventTagRepository.findById(id).orElse(null);
        if (eventTag == null) {
            return ResponseEntity.notFound().build();
        }
        eventTagRepository.delete(eventTag);
        return ResponseEntity.noContent().build();
    }
}
