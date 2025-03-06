package lol.fmg.hub.models.users;


import jakarta.persistence.*;

import lombok.Data;


@Data
@Entity
public class Permission {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String permisionType;

    @Column(nullable = false)
    private Boolean isGranted;

    @ManyToOne
    @JoinColumn(name = "id")
    private Status status;
}