package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bolsadeideas.springboot.web.app.models.Usuario;

/*
- Toda clase controladora debe llevar esta notacion y la palabra controller al final
- Los controladores contienen metodos que manejan peticiones htp del usuario
*/
@Controller
@RequestMapping("/app")
public class IndexController {

	/*
	 * Asigna a la variable el valor en el argumento de la notacion. La regla: ${}
	 * referencia la variable que esta dentro de los corchetes
	 */
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;

	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;

	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;

	/*
	 * Esta notacion puede hacer referencia a diferentes rutas en el navegador.
	 */
	@GetMapping({ "/index", "/home", "/", "" })
	public String index(Model model) {
		/*
		 * Forma de declarar un atributo para usarlo en el archivo retornado. En este
		 * ejemplo el atributo se llama titulo y contiene el valor en la variable
		 * textoIndex. Esta forma de declarar atributos solo viven dentro de esta
		 * funcion, por ende solo se intancia cuando se llama a dicha ruta.
		 */
		model.addAttribute("titulo", textoIndex);
		/*
		 * En la carpeta src/main/resources/templates debe existir un archivo index, que
		 * es el que aca se retorna
		 */
		return "index";
	}

	/*
	 * Notacion para mapear las direcciones url que ejecuta esta funcion. Esta
	 * notacion por defecto es de tipo get. @RequestMapping("/perfil")
	 * = @RequestMapping(value="/perfil", method=RequestMethod.GET)
	 * = @GetMapping("/perfil"). Cada metodo de envio tiene su anotacion
	 * equivalente, para post, put, delete, etc. Y el parametro value es un alias
	 * del parametro path.
	 */
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Andrés");
		usuario.setApellido("Guzmán");
		usuario.setEmail("andres@correo.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}

	/*
	 * La clase model, puede ser remplazada por ModelMap y tendra el mismo
	 * funcionamiento
	 */
	@RequestMapping("/listar")
	public String listar(Model model) {
		/*
		 * Si cambiamos la clase Model por por ejemplo Map<String, Object>, habria que
		 * pushear un dato de la siguiente forma: modelo.put("titulo",
		 * "texto de la variable titulo")
		 */
		model.addAttribute("titulo", textoListar);
		return "listar";
	}

	/*
	 * Esta es otra forma de enviar datos a la vista, que remplazaria a la funcion
	 * anterior dependiendo del proyecto
	 */
	public ModelAndView listarOther(ModelAndView model) {
		model.addObject("titulo", textoListar);
		model.setViewName("listar");
		return model;
	}

	/*
	 * Anotacion para retornar un atributo de tipo usuario que posteriormente podra
	 * ser usado desde cualquier html.
	 */
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Andrés", "Guzmán", "andres@correo.com"),
				new Usuario("John", "Doe", "john@correo.com"), new Usuario("Jane", "Doe", "jane@correo.com"),
				new Usuario("Tornado", "Roe", "roe@correo.com"));
		return usuarios;
	}
}
