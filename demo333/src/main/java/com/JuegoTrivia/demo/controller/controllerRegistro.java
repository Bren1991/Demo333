package com.JuegoTrivia.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JuegoTrivia.demo.model.Usuario;
import com.JuegoTrivia.demo.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("registro")
public class controllerRegistro {
	
			@Autowired
			private UsuarioJpaRepository usuarioJpaRepository;
	
			@GetMapping()
			public String registro() {
				return "./html/registro";
			}

			@PostMapping()
			public String guardarUsuario(Usuario usuariosACrear) {
				usuarioJpaRepository.save(usuariosACrear);
					return "./html/MuchasGracias.html";
			}
		
			
}



