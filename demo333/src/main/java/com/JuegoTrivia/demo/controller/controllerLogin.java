package com.JuegoTrivia.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.JuegoTrivia.demo.model.Usuario;
import com.JuegoTrivia.demo.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("login")
public class controllerLogin {
	
		@Autowired
		private UsuarioJpaRepository UsuarioJpaRepository;
	
		@GetMapping()
		public String login() {
			return "./html/login.html";
		}
		
		@PostMapping()
		public String comprobarLogin(Model model, Usuario user) {
			
			String userNameIngresado = user.getEmail();
			String contraseniaIngresada = user.getPassword();
			
			Usuario usuarioEncontrado = UsuarioJpaRepository.findByUserName(userNameIngresado);
			
		/**	if(usuarioEncontrado == null) {
				return "./html/login";
			}*/
			
			if(usuarioEncontrado.getPassword().equals(contraseniaIngresada)) {
				model.addAttribute("userName", usuarioEncontrado.getUserName());
				return "./html/partida";
			} else {
				return "./html/login";  
			}

		}

	}

