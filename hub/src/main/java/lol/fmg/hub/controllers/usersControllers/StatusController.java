package lol.fmg.hub.controllers.usersControllers;

import lol.fmg.hub.models.users.Status;
import lol.fmg.hub.repositories.usersRepositories.StatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {
    private final StatusRepository statusRepository;

    public StatusController(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    //Created
    @PostMapping
    public ResponseEntity<Status> createStatus(@RequestBody Status status) {
        Status savedStatus = statusRepository.save(status);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStatus);
    }

    //ReadAll
    @GetMapping
    public ResponseEntity<List<Status>> getAllStatus() {
        List<Status> status = statusRepository.findAll();
        if (status.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(status);
    }

    //ReadById
    @GetMapping("/{statusId}")
    public ResponseEntity<Status> getStatus(@PathVariable Long statusId) {
        Status status = statusRepository.findById(statusId).orElse(null);
        if (status == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(status);
    }

    //ReadByDesignation
    @GetMapping("/search-designation")
    public ResponseEntity<List<Status>> getStatus(@RequestParam String designation) {
        List<Status> status = statusRepository.findByDesignation(designation);
        if (status.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(status);
    }

    //UpdatedById
    @PutMapping("/{statusId}")
    public ResponseEntity<Status> updateStatus(@PathVariable Long statusId, @RequestBody Status updatedStatus) {
        Status status = statusRepository.findById(statusId).orElse(null);
        if (status == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(status);
    }

    //DeletedById
    @DeleteMapping("/{statusId}")
    public ResponseEntity<Void> deleteStatus(@PathVariable Long statusId) {
        Status status = statusRepository.findById(statusId).orElse(null);
        if (status == null) {
            return ResponseEntity.notFound().build();
        }
        statusRepository.delete(status);
        return ResponseEntity.noContent().build();
    }
}
