package lol.fmg.hub.models.users;

import lombok.Data;


@Data
public class StructureUserId implements Serializable {

    private User user;
    private Structure structure;

}