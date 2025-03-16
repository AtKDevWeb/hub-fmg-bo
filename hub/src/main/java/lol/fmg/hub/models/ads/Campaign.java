package lol.fmg.hub.models.ads;

import lol.fmg.hub.models.enums.StatusEnum;
import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusEnum statusEnum;

    @OneToMany(mappedBy = "campaign")
    private List<Ads> adsList = new ArrayList<>();

    @OneToMany(mappedBy = "campaign")
    private List<CampaignUserAdministrate> campaignUserAdministrateList = new ArrayList<>();
}