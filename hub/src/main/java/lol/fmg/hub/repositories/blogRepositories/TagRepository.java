package lol.fmg.hub.repositories.blogRepositories;

import lol.fmg.hub.models.blog.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
