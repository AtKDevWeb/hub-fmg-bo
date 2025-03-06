package lol.fmg.hub.models.users;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserSocialnetworkId implements Serializable {
    private User user;
    private Socialnetwork socialnetwork;
}