package lol.fmg.hub.models.events;


import jakarta.persistence.*;
import lol.fmg.hub.models.users.SupportEventOccursOn;
import lol.fmg.hub.models.users.UserEventParticipate;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
    private String statusEnum;

    @OneToMany(mappedBy = "event")
    private List<EventEventTag> eventEventTagList = new ArrayList<>();

    @OneToMany(mappedBy = "event")
    private List<UserEventParticipate> userEventParticipateList = new ArrayList<>();

    @OneToOne(mappedBy = "event")
    private EventEventCategory eventEventCategory;

    @OneToMany(mappedBy = "event")
    private List<EventUserBaseOn> eventUserBaseOnList = new ArrayList<>();

    @OneToMany(mappedBy = "event")
    private List<SupportEventOccursOn> supportEventOccursOnList = new ArrayList<>();

    @OneToMany(mappedBy = "event")
    private List<EventUserContribute> eventUserContributeList = new ArrayList<>();

    @OneToMany(mappedBy = "event")
    private List<EventArticleRelatesto> eventArticleRelatestoList = new ArrayList<>();
}
