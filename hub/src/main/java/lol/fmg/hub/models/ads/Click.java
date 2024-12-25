package lol.fmg.hub.models.ads;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Click {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime clickCreatedAt;

    private String  userIP;

    public LocalDateTime getClickCreatedAt() {
        return clickCreatedAt;
    }

    public void setClickCreatedAt(LocalDateTime clickCreatedAt) {
        this.clickCreatedAt = clickCreatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIP() {
        return userIP;
    }

    public void setUserIP(String userIP) {
        this.userIP = userIP;
    }
}
