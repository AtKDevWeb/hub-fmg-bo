package lol.fmg.hub.models.users;


@Data
@Entity
@IdClass(SupportEventOccursOnId.class)
public class SupportEventOccursOn {
    @Id
    @ManyToOne
    @JoinColumn(name = "support_id")
    private Support support;
    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
