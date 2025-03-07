package lol.fmg.hub.models.ads;


import lombok.*;


import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CampaignUserAdministrateId implements Serializable {

    private Integer userId;
    private Integer campaignId;
}
