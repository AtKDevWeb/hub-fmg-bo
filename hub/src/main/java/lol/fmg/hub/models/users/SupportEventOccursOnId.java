package lol.fmg.hub.models.users;

import lombok.Data;


@Data
public class SupportEventOccursOnId implements Serializable {

    private Support support;
    private Event event;

}