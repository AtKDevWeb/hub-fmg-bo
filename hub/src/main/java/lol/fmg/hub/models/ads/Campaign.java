package lol.fmg.hub.models.ads;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Campaign {

    @Id
    @GeneratedValue
    private Integer id;
    private Float budget;
    private Float unitCost;

    // Description of the advertising campaign
    @Column(nullable = false)
    private String description;

    // short Description of the advertising campaign
    @Column(nullable = false)
    private String synopsis;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    private String statusEnum;

    @OneToMany(mappedBy = "campaign")
    private List<Ads> adsList = new ArrayList<>();

    @OneToMany(mappedBy = "campaign")
    private List<CampaignUserAdministrate> campaignUserAdministrateList = new ArrayList<>();
}