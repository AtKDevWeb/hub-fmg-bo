package lol.fmg.hub.models.ads;


import lol.fmg.hub.models.users.User;
import lombok.*;


import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampaignUserAdministrateId implements Serializable {

    private User user;

    private Campaign campaign;
}
