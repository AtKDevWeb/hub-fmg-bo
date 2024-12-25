package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
