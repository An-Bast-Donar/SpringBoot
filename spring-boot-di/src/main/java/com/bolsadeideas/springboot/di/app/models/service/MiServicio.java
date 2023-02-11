package com.bolsadeideas.springboot.di.app.models.service;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;

/*
- Si no estuvieran declarados en el AppConfig esta fuese la forma de anotacion para estas clases.
- La notacion Component puede ser remplazada por Service para mejor comprencion, hacen lo mismo.
*/
//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IServicio {

	/*
	 * Notacion que indica cuando un metodo se esta sobre escribiendo
	 */
	@Override
	public String operacion() {
		return "ejecutando algún proceso importante simple ...";
	}

}
