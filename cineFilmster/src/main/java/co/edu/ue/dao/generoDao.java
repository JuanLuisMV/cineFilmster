package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Genero;
import co.edu.ue.jpa.Igenero;
@Repository
public class generoDao implements IgeneroDao{
	
	@Autowired
	Igenero jpa;

	@Override
	public List<Genero> guardarGenero(Genero genero) {
		// TODO Auto-generated method stub
		jpa.save(genero);
		return listacompleta();
	}

	@Override
	public Genero actualizarGenero(Genero genero) {
		// TODO Auto-generated method stub
		return jpa.save(genero);
	}

	@Override
	public List<Genero> listacompleta() {
		// TODO Auto-generated method stub
		
		return jpa.findAll();
	}

	@Override
	public Genero busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Genero eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}

}
