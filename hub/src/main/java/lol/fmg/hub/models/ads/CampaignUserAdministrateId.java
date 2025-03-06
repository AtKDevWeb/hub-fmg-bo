package lol.fmg.hub.models.ads;


import lol.fmg.hub.models.users.User;
import lombok.Data;
import java.io.Serializable;

@Data
public class CampaignUserAdministrateId implements Serializable {

    private User user;

    private Campaign campaign;
}
