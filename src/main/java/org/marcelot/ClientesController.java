package org.marcelot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
public class ClientesController {
	
	@Autowired
	private ClientesRepository clienteRepository;
	
	@GetMapping("/list")
	public Iterable<Clientes> getClientes() {
		return clienteRepository.findAll();
	}

}
