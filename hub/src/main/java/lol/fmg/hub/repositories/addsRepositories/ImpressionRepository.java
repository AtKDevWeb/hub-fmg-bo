package lol.fmg.hub.repositories.addsRepositories;

import lol.fmg.hub.models.ads.Impression;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImpressionRepository extends JpaRepository<Impression, Integer> {
}
