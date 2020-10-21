package co.edu.sena.testsring.web.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

import co.edu.sena.testsring.web.models.entity.Cliente;

public class PaginatorReder {

	private String url;
	
	private Page<Cliente> page;
	
	private int totalPaginas;
	
	private int paginaActual;
	
	private int numElemenentosPagina;
	
	private List<PageItem> paginas;

	public PaginatorReder(String url, Page<Cliente> page) {
		this.url = url;
		this.page = page;
		this.paginas = new ArrayList<PageItem>(); 

		numElemenentosPagina = page.getSize();
		totalPaginas = page.getTotalPages();
		paginaActual = page.getNumber() +1;
		

		int desde = 0;
		int hasta = 0;
		
		if (totalPaginas <= numElemenentosPagina) {
			desde = 1;
			hasta = totalPaginas;
		}else {
			if( paginaActual <= numElemenentosPagina/2) {
				desde = 1;
				hasta = numElemenentosPagina;
			} else if (paginaActual >= totalPaginas -numElemenentosPagina/2) {
				desde = totalPaginas - numElemenentosPagina;
				hasta = numElemenentosPagina;
			} else {
				desde = paginaActual - numElemenentosPagina/2;
				hasta = numElemenentosPagina;
			}
		}
		
		for (int i=0; i < hasta;i++) {
			paginas.add(new PageItem((desde + i), paginaActual == desde+i));
		} 
	}

	public String getUrl() {
		return url;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	public List<PageItem> getPaginas() {
		return paginas;
	}
	
	public boolean isFirst() {
		return page.isFirst();
	};
	
	public boolean isLast() {
		return page.isLast();
	};
	
	public boolean isHasPrevious() {
		return page.hasPrevious();
	}
}
