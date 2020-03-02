package com.JuegoTrivia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerPartida {
	
	@GetMapping("partida")
	public String preguntas() {
		return "./html/partida.html";
	}

}
