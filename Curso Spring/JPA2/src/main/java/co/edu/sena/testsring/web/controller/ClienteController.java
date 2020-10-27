package co.edu.sena.testsring.web.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.edu.sena.testsring.web.models.dao.repository.ClienteDao;
import co.edu.sena.testsring.web.models.entity.Cliente;
import co.edu.sena.testsring.web.service.ClienteService;
import co.edu.sena.testsring.web.util.PaginatorReder;

@Controller
//@RequestMapping("/api")
@SessionAttributes("cliente")
public class ClienteController {

	private static final Logger log = Logger.getLogger(ClienteController.class.getName());

	@Autowired
	private ClienteService clienteService;

	public ClienteController() {
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {

		Pageable pageableRequest = PageRequest.of(page, 5);

		Page<Cliente> clientes = clienteService.findAll(pageableRequest);

		PaginatorReder pageRender = new PaginatorReder("/listar", clientes);
		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("cliente", clientes);
		model.addAttribute("pager", pageRender);
		return "listar";
	}

	@GetMapping("/ver/{id}")
	public String ver(@PathVariable(value = "id") Long id, RedirectAttributes flash, Map<String, Object> model) {
		Optional <Cliente> cliente = clienteService.findById(id);
		if (cliente == null) {
			flash.addAttribute("error", "El cliente no esta registrado en la base de datos");
			return "redirect:/listar";
		}

		model.put("cliente", cliente.get());
		model.put("titulo", "Datos del cliente");
		return "ver";
	}

	@RequestMapping("/form")
	public String crear(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		return "form";
	}

	@RequestMapping(value = "/form/{id}")
	public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model) {
		Optional<Cliente> cliente = null;
		if (id > 0) {
			cliente = clienteService.findById(id);
		} else {
			return "redirect:listar";
		}
		model.put("cliente", cliente);
		model.put("titulo", "Editar o modificar datos");
		return "form";
	}

	// @RequestMapping(value = "/form", method = RequestMethod.POST)
	@PostMapping("/form")
	public String save(@Valid Cliente cliente, BindingResult result, Model model, SessionStatus status,
			@RequestParam("file") MultipartFile foto, RedirectAttributes flash) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de cliente");
			return "form";
		}

		if (!foto.isEmpty()) {
			Path direcionRecursos = Paths.get("src/main/resources/static/upload/");
			String rootPath = direcionRecursos.toFile().getAbsolutePath();

			try {
				byte[] bytes = foto.getBytes();

				Path rutaCompleta = Paths.get(rootPath + "/" + foto.getOriginalFilename());
				Files.write(rutaCompleta, bytes);
				flash.addAttribute("info", "Has subido correctamente el archivo");
				cliente.setFoto(foto.getOriginalFilename());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		clienteService.save(cliente);
		status.setComplete();
		return "redirect:listar";
	}

	@RequestMapping(value = "/eliminar/{id}")
	public String delete(@PathVariable Long id) {
		if (id > 0) {
			clienteService.deleteById(id);
		}
		return "redirect:listar";
	}

}
