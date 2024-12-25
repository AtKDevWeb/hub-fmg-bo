package lol.fmg.hub.repositories.blogRepositories;

import lol.fmg.hub.models.blog.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
