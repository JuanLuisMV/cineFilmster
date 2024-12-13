package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Horario;

import co.edu.ue.jpa.Ihorario;

@Repository
public class horarioDao implements IhorarioDao {

	@Autowired
	Ihorario jpa;

	@Override
	public List<Horario> guardarFecha(Horario Fecha) {
		jpa.save(Fecha);
		return listacompleta();
	}



	@Override
	public Horario actualizarFecha(Horario Fecha) {
		// TODO Auto-generated method stub
		return jpa.save(Fecha);
	}



	@Override
	public List<Horario> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}



	@Override
	public Horario busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}



	@Override
	public Horario busquedaporfecha(Date fecha) {
		// TODO Auto-generated method stub
		return jpa.findByFecha(fecha);
	}
	
	@Override
	public Horario eliminarporId(int id) {
		jpa.deleteById(id);
		return null;
	}

	
	
}
