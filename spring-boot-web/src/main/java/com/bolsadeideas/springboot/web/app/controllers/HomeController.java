package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		/*
		 * el forward recarga la pagina y muestra la vista de la redireccion sin cambiar
		 * de url. el redirect recarga la pagina y muestra la vista siguien con su url
		 * respectiva, el redirect tambien puede usarse para cambiar de sitio web,
		 * ejemplo: redirect: https://www.google.com/
		 */
		return "forward:/app/index";
	}
}
