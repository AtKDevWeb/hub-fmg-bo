package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
