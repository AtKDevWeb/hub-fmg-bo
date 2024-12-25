package lol.fmg.hub.repositories.blogRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.xml.stream.events.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
