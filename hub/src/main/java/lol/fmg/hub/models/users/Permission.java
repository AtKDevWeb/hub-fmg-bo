package lol.fmg.hub.models.users;


import jakarta.persistence.*;

import lol.fmg.hub.models.enums.PermissionTypeEnum;
import lombok.Data;


@Data
@Entity
public class Permission {

    @Id
    @GeneratedValue
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PermissionTypeEnum permisionType;

    @Column(nullable = false)
    private Boolean isGranted;

    @ManyToOne
    @JoinColumn(name = "id")
    private Status status;
}