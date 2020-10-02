package co.edu.sena.testsring.web.models.dao.Repository;

import java.util.List;

import co.edu.sena.testsring.web.models.entity.Cliente;

public interface ClienterRepo {

	public List<Cliente> findAll();
}
