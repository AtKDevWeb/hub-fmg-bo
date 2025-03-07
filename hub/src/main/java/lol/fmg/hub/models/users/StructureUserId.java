package lol.fmg.hub.models.users;

import lombok.*;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StructureUserId implements Serializable {

    private User user;
    private Structure structure;

}