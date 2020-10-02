package co.edu.sena.testsring.web.models.dao.daoFacade;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.edu.sena.testsring.web.models.dao.Repository.ClienterRepo;
import co.edu.sena.testsring.web.models.entity.Cliente;

@SuppressWarnings("unused")
@Repository("clienteDao")
public class ClienteDAO implements ClienterRepo  {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Cliente> findAll(){
		return em.createQuery("from Cliente").getResultList();
	}

}
