package lol.fmg.hub.models.users;

@Data
@Entity
@IdClass(UserEventParticipateId.class)
public class UserEventParticipate {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}