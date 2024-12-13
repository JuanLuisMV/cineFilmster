package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Ingreso;
import co.edu.ue.jpa.Iingreso;

@Repository
public class ingresoDao implements IingresoDao {
	
	@Autowired
	Iingreso jpa;

	@Override
	public List<Ingreso> guardaringreso(Ingreso ingreso) {
		// TODO Auto-generated method stub
		jpa.save(ingreso);
		return listacompleta();
	}

	@Override
	public Ingreso actualizaringreso(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return jpa.save(ingreso);
	}

	@Override
	public List<Ingreso> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

	@Override
	public Ingreso busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Ingreso busquedaporfecha(Date fecha) {
		// TODO Auto-generated method stub
		return jpa.findByfechaActualizacion(fecha);
	}

	@Override
	public Ingreso eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}

}
