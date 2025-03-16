package lol.fmg.hub.models.users;

import jakarta.persistence.*;
import lol.fmg.hub.models.enums.PermissionTypeEnum;

import lol.fmg.hub.models.enums.UserStatusEnum;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatusEnum designation;

    @OneToMany(mappedBy = "status")
    private List<User> userList = new ArrayList<>();

    @OneToMany(mappedBy = "status")
    private List<Permission> permissionList = new ArrayList<>();

}

