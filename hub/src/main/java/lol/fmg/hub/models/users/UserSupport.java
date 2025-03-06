package lol.fmg.hub.models.users;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@IdClass(UserSupportId.class)
public class UserSupport {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Id
    @ManyToOne
    @JoinColumn(name = "support_id")
    private Support support;
}