package lol.fmg.hub.repositories.usersRepositories;


import lol.fmg.hub.models.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
