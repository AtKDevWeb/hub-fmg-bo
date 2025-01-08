package lol.fmg.hub.controllers.usersControllers;

import lol.fmg.hub.models.users.SocialNetwork;
import lol.fmg.hub.repositories.usersRepositories.SocialNetworkRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/socialNetworks")
public class SocialNetworkController {
    private final SocialNetworkRepository socialnetworkRepository;

    public SocialNetworkController(SocialNetworkRepository socialnetworkRepository) {
        this.socialnetworkRepository = socialnetworkRepository;
    }

    // CRUD
    // Create
    @PostMapping
    public ResponseEntity<SocialNetwork> createSocialNetwork(@RequestBody SocialNetwork socialnetwork) {
        SocialNetwork savedSocialNetwork = socialnetworkRepository.save(socialnetwork);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSocialNetwork);
    }

    // ReadAll
    @GetMapping
    public ResponseEntity<List<SocialNetwork>> getSocialNetworks() {
        List<SocialNetwork> socialNetworks = socialnetworkRepository.findAll();
        if (socialNetworks.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(socialNetworks);
    }

    // ReadOneByID
    @GetMapping("/{socialNetworkId}")
    public ResponseEntity<SocialNetwork> getSocialNetwork(@PathVariable Long socialNetworkId) {
        SocialNetwork socialNetwork = socialnetworkRepository.findById(socialNetworkId).orElse(null);
        if (socialNetwork == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(socialNetwork);
    }

    // ReadOneByName
    @GetMapping("/search-socialNetworkName")
    public ResponseEntity<List<SocialNetwork>> getSocialNetworkByName(@RequestParam String searchSocialNetworkName) {
        List<SocialNetwork> socialNetwork = socialnetworkRepository.findByName(searchSocialNetworkName);
        if (socialNetwork == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(socialNetwork);
    }

    // Update
    @PutMapping("/{socialNetworkId}")
    public ResponseEntity<SocialNetwork> updateSocialNetwork(@PathVariable Long socialNetworkId, @RequestBody SocialNetwork updatedSocialNetwork) {
        SocialNetwork socialNetwork = socialnetworkRepository.findById(socialNetworkId).orElse(null);
        if (socialNetwork == null) {
            return ResponseEntity.notFound().build();
        }

        socialNetwork.setName(updatedSocialNetwork.getName());
        socialNetwork.setUrl_Logo(updatedSocialNetwork.getUrl_Logo());

        SocialNetwork savedSocialNetwork = socialnetworkRepository.save(updatedSocialNetwork);
        return ResponseEntity.ok(savedSocialNetwork);
    }

    // Delete
    @DeleteMapping("/{socialNetworkId}")
    public ResponseEntity<Void> deleteSocialNetwork(@PathVariable Long socialNetworkId) {
        SocialNetwork socialNetwork = socialnetworkRepository.findById(socialNetworkId).orElse(null);
        if (socialNetwork == null) {
            return ResponseEntity.notFound().build();
        }
        socialnetworkRepository.delete(socialNetwork);
        return ResponseEntity.noContent().build();
    }
}