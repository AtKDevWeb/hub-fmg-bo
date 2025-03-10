package lol.fmg.hub.models.events;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EventCategory {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)

    private String name;

    // Description of the category
    private String description;
    @OneToMany(mappedBy = "eventCategory")
    private List<EventEventCategory> eventEventCategoryList = new ArrayList<>();
}