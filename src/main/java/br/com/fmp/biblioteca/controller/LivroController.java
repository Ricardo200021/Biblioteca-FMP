package br.com.fmp.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmp.biblioteca.model.Livro;
import br.com.fmp.biblioteca.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	@GetMapping("/busca")
	public ResponseEntity<List<Livro>> searchLivros(@RequestParam String keyword){
		return ResponseEntity.ok(livroService.search(keyword));
	}
}
