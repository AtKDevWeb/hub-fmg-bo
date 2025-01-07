package lol.fmg.hub.controllers.usersControllers;


import lol.fmg.hub.models.users.User;
import lol.fmg.hub.repositories.usersRepositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    //CRUD
    //Create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    //ReadAll
    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userRepository.findAll();
        if (users.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(users);
    }
    //ReadOnebyId
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
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
        if () {
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }

    }
}
