package com.bolsadeideas.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bolsadeideas.app.entity.Cliente;

/*
 * - La clase es Long por que el id de Cliente es Long
 * - Podemos extender de JpaRepository (mas completo) o de CrudRepository (para cruds basicos)
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query("SELECT c FROM Cliente c WHERE c.nombre = :nombre AND c.apellido = :apellido")
	List<Cliente> findByNombreAndApellido(@Param("nombre") String nombre, @Param("apellido") String apellido);

}