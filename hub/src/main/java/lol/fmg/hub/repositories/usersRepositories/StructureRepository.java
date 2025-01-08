package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StructureRepository extends JpaRepository<Structure, Long> {
    List<Structure> findByName(String name);
    List<Structure> findByType(String type);
    List<Structure> findByUrlEmail(String url_email);
    List<Structure> findByPhone(String phone);
}

