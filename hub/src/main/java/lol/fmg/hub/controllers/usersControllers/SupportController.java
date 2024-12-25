package lol.fmg.hub.controllers.usersControllers;

import lol.fmg.hub.models.users.Support;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/supports")
public class SupportController {

    //CRUD
    //Create
    @PostMapping
    public ResponseEntity<Support> addSupport(@RequestBody Support support) {
        return ResponseEntity.status((HttpStatus.CREATED).body(support);
    }

    //ReadAll
    @GetMapping
    public ResponseEntity<List<Support>> getSupports() {
        return ResponseEntity.ok(supports);
    }

    //ReadOne
    @GetMapping
    public ResponseEntity<Support> getSupport(@PathVariable Long id) {
        return ResponseEntity.ok(support);
    }
    //Updated
    @PutMapping
    public ResponseEntity<Support> updateSupport(@PathVariable long id, @RequestBody Support support) {
        return ResponseEntity.ok(updatedSUpport);
    }
    //Delete
    @DeleteMapping
    public ResponseEntity<Support> deleteSupport(@PathVariable Long id) {
        if (.){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
