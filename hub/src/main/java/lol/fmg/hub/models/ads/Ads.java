package lol.fmg.hub.models.ads;

import lombok.Data;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Ads {
        @Id
        @GeneratedValue
        private Integer id;
        private String title;

        // Description of the tag
        private String description;
        private String targetUrl;

        //Relation Mapping
        @ManyToOne
        @JoinColumn(name = "campaign_id")
        private Campaign campaign;

        @OneToMany(mappedBy = "ads")
        private List<Impression> impressionList = new ArrayList<>();

        @OneToMany(mappedBy = "ads")
        private List<Click> clickList = new ArrayList<>();

        @OneToMany(mappedBy = "ads")
        private List<AdsVideoInsert> adsVideoInsertList = new ArrayList<>();

        @OneToMany(mappedBy = "ads")
        private List<AdsImageRepresent> adsImageRepresentList = new ArrayList<>();


}

