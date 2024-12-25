package lol.fmg.hub.repositories.blogRepositories;

import lol.fmg.hub.models.blog.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
