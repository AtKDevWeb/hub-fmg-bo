package lol.fmg.hub.controllers.eventsControllers;

import lol.fmg.hub.models.events.EventCategory;
import lol.fmg.hub.repositories.eventsRepositories.EventCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventCategories")
public class EventCategoryController {
    private final EventCategoryRepository eventCategoryRepository;

    public EventCategoryController(EventCategoryRepository eventCategoryRepository) {
        this.eventCategoryRepository = eventCategoryRepository;
    }

    // CRUD
    // Create
    @PostMapping
    public ResponseEntity<EventCategory> createEventCategory(@RequestBody EventCategory eventCategory) {
        EventCategory savedEventCategory = eventCategoryRepository.save(eventCategory);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEventCategory);
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<EventCategory>> getEventCategories() {
        List<EventCategory> eventCategories = eventCategoryRepository.findAll();
        if (eventCategories.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(eventCategories);
    }

    // Read One By ID
    @GetMapping("/{id}")
    public ResponseEntity<EventCategory> getEventCategory(@PathVariable Long id) {
        EventCategory eventCategory = eventCategoryRepository.findById(id).orElse(null);
        if (eventCategory == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(eventCategory);
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<EventCategory> updateEventCategory(@PathVariable Long id, @RequestBody EventCategory updatedEventCategory) {
        EventCategory eventCategory = eventCategoryRepository.findById(id).orElse(null);
        if (eventCategory == null) {
            return ResponseEntity.notFound().build();
        }
        EventCategory savedEventCategory = eventCategoryRepository.save(updatedEventCategory);
        return ResponseEntity.ok(savedEventCategory);
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEventCategory(@PathVariable Long id) {
        EventCategory eventCategory = eventCategoryRepository.findById(id).orElse(null);
        if (eventCategory == null) {
            return ResponseEntity.notFound().build();
        }
        eventCategoryRepository.delete(eventCategory);
        return ResponseEntity.noContent().build();
    }
}
