package br.com.fmp.biblioteca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fmp.biblioteca.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByLogin(String login);
}
