package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@IdClass(StructureUserId.class)
public class StructureUser {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "structure_id")
    private Structure structure;
}