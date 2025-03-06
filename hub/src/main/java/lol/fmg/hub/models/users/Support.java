package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Support {
    @Id
    private Integer id;

    @Column(nullable = false)
    private String denomination;

    private String slug;
    private String gameCount;
    private String imageBackGround;

    @OneToMany(mappedBy = "support")
    private List<UserSupport> userSupportList = new ArrayList<>();

    @OneToMany(mappedBy = "support")
    private List<SupportEventOccursOn> supportEventOccursOnList = new ArrayList<>();

}
