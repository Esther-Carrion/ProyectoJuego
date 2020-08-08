package net.gecc.crudthymeleaf.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import net.gecc.crudthymeleaf.entities.cliente;

public interface ClienteRepo extends CrudRepository <cliente, String> {
		List<cliente> findByNombre(String nombre);
		List<cliente> findById(Long Id);
}
