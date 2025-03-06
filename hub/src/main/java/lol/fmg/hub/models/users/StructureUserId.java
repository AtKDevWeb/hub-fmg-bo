package lol.fmg.hub.models.users;

import lombok.Data;

import java.io.Serializable;


@Data
public class StructureUserId implements Serializable {

    private User user;
    private Structure structure;

}