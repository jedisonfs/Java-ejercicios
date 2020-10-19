package co.edu.sena.testsring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.testsring.web.models.dao.credao.ClienteRepository;
import co.edu.sena.testsring.web.models.dao.repository.ClienteDao;
import co.edu.sena.testsring.web.models.entity.Cliente;

@Service
public class ClienteService implements ClienteRepository {

	@Autowired
	ClienteDao clienteDao;

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDao.save(cliente);
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return  clienteDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.delete(id);
	}

}
