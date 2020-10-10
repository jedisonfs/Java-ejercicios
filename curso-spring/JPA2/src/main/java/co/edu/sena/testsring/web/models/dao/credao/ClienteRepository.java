package co.edu.sena.testsring.web.models.dao.credao;

import java.util.List;

import co.edu.sena.testsring.web.models.entity.Cliente;

public interface ClienteRepository  {
	
	List<Cliente> findAll();
	
	void save(Cliente cliente);
	
	Cliente findById(Long id);
	
	void delete(Long id);

}
