package co.edu.sena.testsring.web.models.dao.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.edu.sena.testsring.web.models.dao.credao.ClienteRepository;
import co.edu.sena.testsring.web.models.entity.Cliente;

@SuppressWarnings("unused")
@Component("clienteDao")
public class ClienteDao implements ClienteRepository {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private ClienteRepository clienteRepository;

	public ClienteDao() {
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> findAll() {
		return em.createQuery("from Cliente").getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public Cliente findById(Long id) {
		return em.find(Cliente.class, id);
	}

	@Transactional
	@Override
	public void save(Cliente cliente) {
		if (cliente.getId() != null && cliente.getId() > 0) {
			em.merge(cliente);
		} else {
			em.persist(cliente);
		}
	}
	@Transactional
	@Override
	public void delete(Long id) {
		em.remove(findById(id));
	}

}
