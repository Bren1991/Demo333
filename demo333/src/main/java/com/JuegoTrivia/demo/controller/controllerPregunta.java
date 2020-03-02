package com.JuegoTrivia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerPregunta {

		@GetMapping("preguntas")
		public String preguntas() {
			return "./html/preguntas.html";
		}


}
