package lol.fmg.hub.models.users;

import jakarta.persistence.*;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Structure {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String denomination;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String email;
    private String website;
    @Column(nullable = false)
    private String statusEnum;
    // type of structure : Enterprise, Association, Federation ...
    @Column(nullable = false)
    private String typeEnum;
    @OneToMany(mappedBy = "structure")
    private List<StructureUser> structureUserList = new ArrayList<>();
}