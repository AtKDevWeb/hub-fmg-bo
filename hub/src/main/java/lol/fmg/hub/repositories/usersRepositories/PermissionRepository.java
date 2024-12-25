package lol.fmg.hub.repositories.usersRepositories;

import lol.fmg.hub.models.users.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

}
