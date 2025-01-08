package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Long> {
    List<Status> findByDesignation(String designation);
}
