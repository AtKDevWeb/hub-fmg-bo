package lol.fmg.hub.controllers.usersControllers;


import lol.fmg.hub.models.users.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {



    //CRUD
    //Create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    //ReadAll
    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(users);
    }
    //ReadOne
    @GetMapping
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(user);
    }
    //Updated
    @PutMapping
    public ResponseEntity<User> updateUser( @PathVariable Long id, @RequestBody User user) {
        return ResponseEntity.ok(updatedUser);
    }
    //Delete
    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        if (.) {
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }

    }
}
