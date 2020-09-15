package org.marcelot;

import org.springframework.data.repository.CrudRepository;

public interface ClientesRepository extends CrudRepository<Clientes, Integer>{
	
	Clientes findUsuarioById(Integer tblUsuarioId);

}
