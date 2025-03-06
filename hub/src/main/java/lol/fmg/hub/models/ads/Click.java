package lol.fmg.hub.models.ads;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Click {

    @Id
    @GeneratedValue
    private Integer id;
    private LocalDate time;

    private String userIp;

    @ManyToOne
    @JoinColumn(name = "ads_id")
    private Ads ads;

}