package lol.fmg.hub.models.users;


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