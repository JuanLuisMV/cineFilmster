package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IsalaDao;
import co.edu.ue.entity.Sala;
@Service
public class salaService implements IsalaService{
	
	@Autowired
	IsalaDao dao;

	@Override
	public List<Sala> saveSala(Sala sala) {
		if("libre".equalsIgnoreCase(sala.getEstado()) || "ocupado".equalsIgnoreCase(sala.getEstado())) {
			
			return dao.guardarSala(sala);
			
		}else {
			throw new IllegalArgumentException("Estado inválido. Solo se permiten los estados 'libre' o 'ocupado'.");
		}	
	}

	@Override
	public Sala upSala(Sala sala) {
		// TODO Auto-generated method stub
		return dao.actualizarSala(sala);
	}

	@Override
	public List<Sala> listAll() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Sala findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Sala deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}

}
