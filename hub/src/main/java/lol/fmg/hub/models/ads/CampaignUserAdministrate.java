package lol.fmg.hub.models.ads;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@IdClass(CampaignUserAdministrateId.class)
public class CampaignUserAdministrate {

    @Id
    @ManyToOne
    @JoinColumn(name = "id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;
}