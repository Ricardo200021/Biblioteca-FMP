package br.com.fmp.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fmp.biblioteca.model.Livro;
import br.com.fmp.biblioteca.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	public Livro save(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public List<Livro> search(String keyword){
		return livroRepository.findByTituloContainingOrPalavraChaveContaining(keyword, keyword);
	}
}
