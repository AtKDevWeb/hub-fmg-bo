package lol.fmg.hub.models.users;

import lombok.Data;
import java.io.Serializable;

@Data
public class UserSupportId implements Serializable {
    private User user;
    private Support support;
}
