package lol.fmg.hub.models.users;


import jakarta.persistence.*;
import lol.fmg.hub.models.ads.CampaignUserAdministrate;
import lol.fmg.hub.models.blog.Comment;
import lol.fmg.hub.models.blog.Image;
import lol.fmg.hub.models.events.EventUserContribute;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @ManyToOne
    @JoinColumn(name = "id")
    private Status status;

    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String surname;
    @Lob
    private String description;
    private String email;

    // enregistré crypté en base
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<UserSocialnetwork> userSocialnetworkList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<UserGame> userGameList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<UserSupport> userSupportList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<UserEventParticipate> userEventParticipateList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<StructureUser> structureUserList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<UserArticleWrite> userArticleWriteList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<CampaignUserAdministrate> campaignUserAdministrateList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<EventUserContribute> eventUserContributeList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Image> imageList = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Comment> commentList = new ArrayList<>();
}
