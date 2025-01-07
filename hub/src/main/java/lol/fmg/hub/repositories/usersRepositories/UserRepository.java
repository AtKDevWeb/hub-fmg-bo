package lol.fmg.hub.repositories.usersRepositories;


import lol.fmg.hub.models.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
    User findByEmail(String email);
    User findBySurname(String surname);
}
