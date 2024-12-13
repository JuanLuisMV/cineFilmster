package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Administradore;
import co.edu.ue.jpa.Iadministrador;
@Repository
public class administradorDao implements IadministradorDao {
	
	@Autowired
	Iadministrador jpa;

	@Override
	public List<Administradore> guardarAdmin(Administradore Admin) {
		// TODO Auto-generated method stub
		jpa.save(Admin);
		return listacompleta();
	}

	@Override
	public Administradore actualizarAdmin(Administradore Admin) {
		// TODO Auto-generated method stub
		return jpa.save(Admin);
	}

	@Override
	public List<Administradore> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

	@Override
	public Administradore busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Administradore busquedaporfecha(Date fecha) {
		// TODO Auto-generated method stub
		return jpa.findByfechaCreacion(fecha);
	}

	@Override
	public Administradore eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}

	@Override
	public Administradore busquedaporemail(String email) {
		// TODO Auto-generated method stub
		return jpa.findBycorreo(email);
	}
	

}
