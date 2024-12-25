package lol.fmg.hub.repositories.blogRepositories;

import lol.fmg.hub.models.blog.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
