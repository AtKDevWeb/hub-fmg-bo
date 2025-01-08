package lol.fmg.hub.controllers.usersControllers;

import lol.fmg.hub.models.users.Game;
import lol.fmg.hub.repositories.usersRepositories.GameRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    // CRUD
    // Create
    @PostMapping
    public ResponseEntity<Game> createGame(@RequestBody Game game) {
        Game savedGame = gameRepository.save(game);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedGame);
    }

    // ReadAll
    @GetMapping
    public ResponseEntity<List<Game>> getGames() {
        List<Game> games = gameRepository.findAll();
        if (games.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(games);
    }

    // ReadOneByID
    @GetMapping("/{gameId}")
    public ResponseEntity<Game> getGame(@PathVariable Long gameId) {
        Game game = gameRepository.findById(gameId).orElse(null);
        if (game == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(game);
    }

    // ReadOneByTitle
    @GetMapping("/search-gameTitle")
    public ResponseEntity <List<Game>> getGame(@RequestParam String searchGameTitle) {
        List<Game> games = gameRepository.findByTitle(searchGameTitle);
        if (games.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(games);
    }

    //ReadByContentContainingString
    @GetMapping("/search-term")
    public ResponseEntity<List<Game>> getGameByTerm(@RequestParam String term) {
        List<Game> games = gameRepository.findByDescriptionContainingIgnoreCase(term);
        if (games == null||games.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(games);
    }

    // Update
    @PutMapping("/{gameId}")
    public ResponseEntity<Game> updateGame(@PathVariable Long gameId, @RequestBody Game updatedGame) {
        Game game = gameRepository.findById(gameId).orElse(null);
        if (game == null) {
            return ResponseEntity.notFound().build();
        }

        game.setTitle(updatedGame.getTitle());
        game.setDescription(updatedGame.getDescription());
        game.setUrlImage(updatedGame.getUrlImage());
        game.setUrlVideo(updatedGame.getUrlVideo());
        game.setGenres(updatedGame.getGenres());
        game.setPlatforms(updatedGame.getPlatforms());
        game.setSummary(updatedGame.getSummary());

        Game savedGame = gameRepository.save(game);
        return ResponseEntity.ok(savedGame);
    }

    // Delete
    @DeleteMapping("/gameId")
    public ResponseEntity<Void> deleteGame(@PathVariable Long gameId) {
        Game game = gameRepository.findById(gameId).orElse(null);
        if (game == null) {
            return ResponseEntity.notFound().build();
        }
        gameRepository.delete(game);
        return ResponseEntity.noContent().build();
    }
}