package br.com.fmp.biblioteca.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fmp.biblioteca.model.User;
import br.com.fmp.biblioteca.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//método para salvar usuário
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public Optional<User> findByLogin(String login){
		return userRepository.findByLogin(login);
	}
}
