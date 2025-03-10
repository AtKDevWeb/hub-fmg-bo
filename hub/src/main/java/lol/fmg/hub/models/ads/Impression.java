package lol.fmg.hub.models.ads;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Impression {

    @Id
    @GeneratedValue
    private Integer id;

    // duration in second
    private Integer duration;

    @Column(nullable = false)
    private String targetUrl;

    @ManyToOne
    @JoinColumn(name = "ads_id")
    private Ads ads;
}
