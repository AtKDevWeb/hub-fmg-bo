package lol.fmg.hub.repositories.addsRepositories;

import lol.fmg.hub.models.ads.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Integer> {
}
