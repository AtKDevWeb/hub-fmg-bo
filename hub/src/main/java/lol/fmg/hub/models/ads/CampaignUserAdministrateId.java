package lol.fmg.hub.models.ads;


import lol.fmg.hub.models.users.User;
import lombok.*;


import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampaignUserAdministrateId implements Serializable {

    private Integer user_id;

    private Integer campaign_id;
}
