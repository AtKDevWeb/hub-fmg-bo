package lol.fmg.hub.models.ads;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Impression {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime impressionCreatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getImpressionCreatedAt() {
        return impressionCreatedAt;
    }

    public void setImpressionCreatedAt(LocalDateTime impressionCreatedAt) {
        this.impressionCreatedAt = impressionCreatedAt;
    }
}