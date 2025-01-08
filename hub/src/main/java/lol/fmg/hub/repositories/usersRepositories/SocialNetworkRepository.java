package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.SocialNetwork;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SocialNetworkRepository extends JpaRepository<SocialNetwork, Long> {
    List<SocialNetwork> findByName(String name);
}
