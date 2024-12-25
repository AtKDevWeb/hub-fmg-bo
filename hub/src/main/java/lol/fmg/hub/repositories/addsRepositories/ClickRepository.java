package lol.fmg.hub.repositories.addsRepositories;

import lol.fmg.hub.models.ads.Click;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClickRepository extends JpaRepository<Click, Long> {
}
