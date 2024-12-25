package lol.fmg.hub.repositories.blogRepositories;

import lol.fmg.hub.models.blog.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
