package lol.fmg.hub.models.events;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class EventTag {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    // Description of the tag
    private String description;
    @OneToMany(mappedBy = "eventTag")
    private List<EventEventTag> eventEventTagList = new ArrayList<>();
}