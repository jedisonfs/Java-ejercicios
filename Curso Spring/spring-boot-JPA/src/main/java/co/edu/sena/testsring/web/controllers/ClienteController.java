package co.edu.sena.testsring.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.sena.testsring.web.models.dao.daoFacade.ClienteDAO;
import co.edu.sena.testsring.web.models.entity.Cliente;

@Controller
@RequestMapping
public class ClienteController {
	
	@Autowired
	@Qualifier("clineteDao")
	private ClienteDAO clienteDao;
	
	@GetMapping("/listar")
	public String  listar(Model model) {
		model.addAttribute("titulo","Listado de clientes");
		model.addAttribute("cliente", clienteDao.findAll());
		return "listar";
	}

}
