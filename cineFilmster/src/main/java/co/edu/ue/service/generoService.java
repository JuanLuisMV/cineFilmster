package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IgeneroDao;
import co.edu.ue.entity.Genero;

@Service
public class generoService implements IgeneroService {
	@Autowired
	IgeneroDao dao;

	@Override
	public List<Genero> saveGenero(Genero genero) {
		// TODO Auto-generated method stub
		return dao.guardarGenero(genero);
	}

	@Override
	public Genero upGenero(Genero genero) {
		// TODO Auto-generated method stub
		return dao.actualizarGenero(genero);
	}

	@Override
	public List<Genero> listAll() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Genero findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Genero deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}

}
