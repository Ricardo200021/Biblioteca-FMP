package br.com.fmp.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fmp.biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	List<Livro> findByTituloContainingOrPalavraChaveContaining (String titulo, String palavraChave);
}
