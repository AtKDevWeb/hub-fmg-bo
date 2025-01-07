package lol.fmg.hub.controllers.usersControllers;


import lol.fmg.hub.models.users.Support;
import lol.fmg.hub.repositories.usersRepositories.SupportRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supports")
public class SupportController {

    private final SupportRepository supportRepository;

    public SupportController(SupportRepository supportRepository) {
        this.supportRepository = supportRepository;
    }

    //CRUD
    //Create
    @PostMapping
    public ResponseEntity<Support> addSupport(@RequestBody Support support) {
        Support savedSupport = supportRepository.save(support);

        return ResponseEntity.status(HttpStatus.CREATED).body(support);
    }

    //ReadAll
    @GetMapping
    public ResponseEntity<List<Support>> getSupports() {
        List<Support> supports = supportRepository.findAll();
        if (supports.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(supports);
    }

    //ReadOne
    @GetMapping("/{id}")
    public ResponseEntity<Support> getSupport(@PathVariable Long id) {
        Support support = supportRepository.findById(id).orElse(null);
        if (support == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(support);
    }
    //ReadOneByName
    @GetMapping("/search-nameSupport")
    public ResponseEntity<Support> getSupport(@RequestBody String searchNameSupport) {
        Support support = supportRepository.findByDenomination(searchNameSupport);
        if (support == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(support);
    }

    //ReadOneBySlug
    @GetMapping("/search-slug")
    public ResponseEntity<Support> getSlug(@RequestBody String searchSlug) {
        Support support = supportRepository.findBySlug(searchSlug);
        if (support == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(support);
    }

    //UpdatedById
    @PutMapping("/{id}")
    public ResponseEntity<Support> updateSupport(@PathVariable long id, @RequestBody Support support) {
        Support updatedSupport = supportRepository.findById(id).orElse(null);
        if (updatedSupport == null) {
            return ResponseEntity.notFound().build();
        }

        updatedSupport.setDenomination(support.getDenomination());
        updatedSupport.setSlug(support.getSlug());
        updatedSupport.setDescription(support.getDescription());
        updatedSupport.setUrl_imageLogo(support.getUrl_imageLogo());

        Support savedSupport = supportRepository.save(updatedSupport);

        return ResponseEntity.ok(updatedSupport);
    }

    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Support> deleteSupport(@PathVariable Long id) {
        Support support = supportRepository.findById(id).orElse(null);
        if (support == null) {
            return ResponseEntity.noContent().build();
        }
        supportRepository.delete(support);
        return ResponseEntity.noContent().build();
    }
}
