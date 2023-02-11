package com.bolsadeideas.springboot.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplicationSe puede usar una sola anotación para habilitar esas tres funciones:
- @EnableAutoConfiguration: habilitar el mecanismo de configuración automática de Spring Boot
- @ComponentScan: habilite escaneo de componentes en el paquete donde se encuentra la aplicación
- @Configuration: permite registrar beans adicionales en el contexto o importar clases de configuración adicionales
*/
@SpringBootApplication
public class SpringBootWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}
