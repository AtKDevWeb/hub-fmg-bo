package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.SocialNetwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialNetworkRepository extends JpaRepository<SocialNetwork, Long> {
}
