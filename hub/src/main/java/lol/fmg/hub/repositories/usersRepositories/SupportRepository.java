package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.Support;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupportRepository extends JpaRepository<Support, Long> {
    Support findByDenomination(String denomination);
    Support findBySlug(String slug);
}
