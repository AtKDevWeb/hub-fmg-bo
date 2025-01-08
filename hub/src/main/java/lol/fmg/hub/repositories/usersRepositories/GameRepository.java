package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByTitle(String title);
    List<Game> findByDescriptionContainingIgnoreCase(String terms);
}

