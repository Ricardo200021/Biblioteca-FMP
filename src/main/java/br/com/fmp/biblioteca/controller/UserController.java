package br.com.fmp.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmp.biblioteca.model.User;
import br.com.fmp.biblioteca.service.UserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> createUsuario(@RequestBody User user){
		return ResponseEntity.ok(userService.save(user));
	}
}
