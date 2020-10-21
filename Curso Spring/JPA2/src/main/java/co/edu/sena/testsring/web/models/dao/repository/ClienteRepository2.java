package co.edu.sena.testsring.web.models.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import co.edu.sena.testsring.web.models.entity.Cliente;

public interface ClienteRepository2 extends PagingAndSortingRepository<Cliente, Long> {
	
	List<Cliente> findAll();
	
	Page<Cliente> findAll(Pageable pageable);
	
	Cliente save(Cliente cliente);
	
	Optional<Cliente> findById(Long id);
	
	void deleteById(Long id);

}
