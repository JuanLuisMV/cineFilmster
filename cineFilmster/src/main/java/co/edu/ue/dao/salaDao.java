package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Sala;
import co.edu.ue.jpa.Isala;
@Repository
public class salaDao implements IsalaDao{
	
	@Autowired
	Isala jpa;

	@Override
	public List<Sala> guardarSala(Sala sala) {
		jpa.save(sala);
		return listacompleta();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		// TODO Auto-generated method stub
		return jpa.save(sala);
	}

	@Override
	public List<Sala> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

	@Override
	public Sala busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Sala eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}

}
