package br.com.its.cursomc.manager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.its.cursomc.dao.CategoriaDao;
import br.com.its.cursomc.domain.Categoria;
import br.com.its.cursomc.manager.exception.ObjectNotFoundException;

@Service
public class CategoriaManager {
	
	@Autowired
	private CategoriaDao dao;
	
	public Categoria buscar(Integer id) {
	    Optional<Categoria> obj = dao.findById(id);
	    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
