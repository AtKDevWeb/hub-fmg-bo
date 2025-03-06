package lol.fmg.hub.models.events;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class EventCategory {
    @Id

    @GeneratedValue
    private Integer id;
    @Column(nullable = false)

    private String name;

    // Description of the category
    private String description;
    @OneToMany(mappedBy = "eventCategory")
    private List<EventEventCategory> eventEventCategoryList = new ArrayList<>();
}