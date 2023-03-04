package com.gestionressources.gres.Repository;

import java.util.Optional;


import com.gestionressources.gres.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
