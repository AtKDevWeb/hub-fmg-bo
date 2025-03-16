package lol.fmg.hub.models.ads;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Click {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate time;

    private String userIp;

    @ManyToOne
    @JoinColumn(name = "ads_id")
    private Ads ads;

}