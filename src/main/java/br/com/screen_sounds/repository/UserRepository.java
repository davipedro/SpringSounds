package br.com.screen_sounds.repository;

import br.com.screen_sounds.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
