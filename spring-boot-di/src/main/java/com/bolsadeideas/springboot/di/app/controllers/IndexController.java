package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;

/*
- Los controladores llaman a los servicios para mostrar los datos que estos traigan en las vistas.
*/
@Controller
public class IndexController {

	/*
	 * La notacion Autowired inyecta una dependencia en la clase, esta notacion la
	 * inyecta como instancia singlenton que vive en todo el proyecto, la notacion
	 * ualifier permite referenciar cual es la dependencia que estamos inyectando,
	 * puesto que hay varias dependencias que pueden provenir de la interfaz
	 * declarada. Existen diferentes formas de inyectar una dependencia, en la
	 * declaracion, en un get con las mismas notaciones o si la clase tiene un
	 * constructor, se puede declarar de la dependencia dentro de los paramentros
	 * del constructor y el mismo realiza la inyeccion sin ninguna notacion
	 */
	@Autowired
	@Qualifier("miServicioComplejo")
	private IServicio servicio;

	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

}
