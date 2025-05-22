package br.com.cpdias.bookstore.user;

import java.util.Optional;

public interface UserRepository {// extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String username);
}
