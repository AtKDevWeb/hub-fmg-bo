package lol.fmg.hub.models.users;

import jakarta.persistence.*;



@Data
@Entity
public class Status {
    @Id
    @GeneratedValue
    private Integer id;
    private String designation;
    @OneToMany(mappedBy = "status")
    private List<User> userList = new ArrayList<>();
    @OneToMany(mappedBy = "status")
    private List<Permission> permissionList = new ArrayList<>();
}

