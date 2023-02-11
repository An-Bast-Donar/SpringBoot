package com.bolsadeideas.springboot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/*
- Por defecto el scope de un compoenente es singlenton, osea que vive una instancia en toda la app.
- Para especificar lo contrario se puede usar @RequestScope: que vive lo que dure la peticion http.
- @SessionScope: finaliza cuando se cierra el navegador o se vence la session.
- @SessionScope, necesita implementar la interfaz serializable y crear uno statico pordefecto
*/
@Component
@RequestScope
public class Factura {

	@Value("${factura.descripcion}")
	private String descripcion;

	@Autowired
	private Cliente cliente;

	@Autowired
	private List<ItemFactura> items;

	/*
	 * El ciclo de vida de un componente basicamente es el de inicializacion y el de
	 * destruccion. Esta es la notacion para el metodo que se invoca al
	 * inicializarse, despues de construirse y de instanciar e iniciar las variables
	 */
	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("José"));
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
	}

	/*
	 * Esta es la notacion para la funcion que se invoca al destruirse
	 */
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida: ".concat(descripcion));
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
