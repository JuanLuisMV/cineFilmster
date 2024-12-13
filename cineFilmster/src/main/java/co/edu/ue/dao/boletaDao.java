package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Boleta;
import co.edu.ue.jpa.Iboleta;

@Repository
public class boletaDao implements IboletaDao {
	
	@Autowired
	Iboleta jpa;

	@Override
	public List<Boleta> guardarboleta(Boleta boleta) {
		// TODO Auto-generated method stub
		jpa.save(boleta);
		return listacompleta();
	}

	@Override
	public Boleta actualizaringreso(Boleta boleta) {
		// TODO Auto-generated method stub
		return jpa.save(boleta);
	}

	@Override
	public List<Boleta> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

	@Override
	public Boleta busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Boleta busquedaporfecha(Date fecha) {
		// TODO Auto-generated method stub
		return jpa.findByfechaCompra(fecha);
	}

	@Override
	public Boleta eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}

}
