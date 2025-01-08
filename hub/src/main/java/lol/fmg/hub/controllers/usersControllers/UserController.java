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
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
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
    //ReadOneById
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    //ReadAllByLastName
    @GetMapping("/search-firstName")
    public ResponseEntity<List<User>> getUserByFirstName(@RequestParam String searchFirstName) {
        List<User> users = userRepository.findByFirstName(searchFirstName);
        if (users.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);
    }
    //ReadAllByLastName
    @GetMapping("/search-lastName")
    public ResponseEntity<List<User>> getUserByLastName(@RequestParam String searchLastName) {
        List<User> users = userRepository.findByLastName(searchLastName);
        if (users.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);
    }
    //ReadAllByLastName
    @GetMapping("/search-eMail")
    public ResponseEntity<List<User>> getUserByEmail(@RequestParam String searchEmail) {
        List<User> users = userRepository.findByEmail(searchEmail);
        if (users .isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);
    }
    //ReadAllByLastName
    @GetMapping("/search-surname")
    public ResponseEntity<List<User>> getUserBySurname(@RequestParam String searchSurname) {
        List<User> user = userRepository.findBySurname(searchSurname);
        if (user .isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    //Updated
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser( @PathVariable Long id, @RequestBody User updatedUser) {
        User user = userRepository.findById(id).orElse(null);

        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setEmail(updatedUser.getEmail());
        user.setSurname(updatedUser.getSurname());

        User savedUser = userRepository.save(user);

        return ResponseEntity.ok(savedUser);
    }

    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);

        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        userRepository.delete(user);
        return ResponseEntity.noContent().build();
    }
}
