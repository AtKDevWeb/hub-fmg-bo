package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Game {

    @Id
    @GeneratedValue
    private Integer id;

    private String denomination;
    private String genres;
    private String releaseDate;
    private String summary;

    @OneToMany(mappedBy = "game")
    private List<UserGame> userGameList = new ArrayList<>();
    @OneToMany(mappedBy = "game")
    private List<EventUserBaseOn> eventUserBaseOnList = new ArrayList<>();
}
