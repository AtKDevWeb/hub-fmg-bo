package lol.fmg.hub.controllers.usersControllers;

import lol.fmg.hub.models.users.Structure;
import lol.fmg.hub.repositories.usersRepositories.StructureRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/structure")
public class StructureController {

    private final StructureRepository structureRepository;

    public StructureController(StructureRepository structureRepository) {
        this.structureRepository = structureRepository;
    }

    //CRUD
    //Create
    @PostMapping
    public ResponseEntity<Structure> AddStructure(@RequestBody Structure structure) {
        Structure savedStructure = structureRepository.save(structure);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStructure);
    }
    //ReadAll
    @GetMapping
    public ResponseEntity<List<Structure>> GetAllStructures() {
        List<Structure> allStructures = structureRepository.findAll();
        if (allStructures.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(allStructures);
    }
    //ReadAllByName
    @GetMapping("/search-name")
    public ResponseEntity<List<Structure>> GetAllStructuresByName(@RequestParam String searchName) {
        List<Structure> allStructuresByName = structureRepository.findByName(searchName);
        if (allStructuresByName.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(allStructuresByName);
    }

    //ReadAllByEmail
    @GetMapping("/search-email")
    public ResponseEntity<List<Structure>> GetAllStructuresByEmail(@RequestParam String searchEmail) {
        List<Structure> allStructuresByEmail = structureRepository.findByUrlEmail(searchEmail);
        if (allStructuresByEmail.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(allStructuresByEmail);
    }

    //ReadAllByPhone
    @GetMapping("/search-phone")
    public ResponseEntity<List<Structure>> GetAllStructuresByPhone(@RequestParam String searchPhone) {
        List<Structure> allStructuresByPhone = structureRepository.findByPhone(searchPhone);
        if (allStructuresByPhone.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(allStructuresByPhone);
    }

    //ReadOneById
    @GetMapping("/{id}")
    public ResponseEntity<Structure> GetStructure(@PathVariable long id) {
        Structure structure = structureRepository.findById(id).orElse(null);
        if (structure == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(structure);

    }
    //Updated
    @PutMapping("/{id}")
    public ResponseEntity<Structure> UpdateStructure(@PathVariable long id, @RequestBody Structure structure) {
        Structure updatedStructure = structureRepository.findById(id).orElse(null);
        if (updatedStructure == null) {
            return ResponseEntity.notFound().build();
        }

        structure.setName(updatedStructure.getName());
        structure.setDescription(updatedStructure.getDescription());
        structure.setLogo(updatedStructure.getLogo());
        structure.setDescription(updatedStructure.getDescription());
        structure.setPhone(updatedStructure.getPhone());
        structure.setStreetNumber(updatedStructure.getStreetNumber());
        structure.setStreetNumberComplement(updatedStructure.getStreetNumberComplement());
        structure.setStreetAddress(updatedStructure.getStreetAddress());
        structure.setZipCode(updatedStructure.getZipCode());
        structure.setCity(updatedStructure.getCity());
        structure.setCountry(updatedStructure.getCountry());
        structure.setUrlEmail(updatedStructure.getUrlEmail());
        structure.setUrlWebsite(updatedStructure.getUrlWebsite());

        structureRepository.save(structure);

        return ResponseEntity.ok(structure);
    }
    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Structure> DeleteStructure(@PathVariable long id) {
        Structure structure = structureRepository.findById(id).orElse(null);
        if (structure == null) {
            return ResponseEntity.notFound().build();
        }
        structureRepository.delete(structure);
        return ResponseEntity.notFound().build();
    }
}
