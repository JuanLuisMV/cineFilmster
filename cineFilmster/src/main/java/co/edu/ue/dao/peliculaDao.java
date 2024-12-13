package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Pelicula;
import co.edu.ue.jpa.Ipelicula;
@Repository
public class peliculaDao implements IpeliculaDao {
	
	@Autowired
	Ipelicula jpa;

	@Override
	public List<Pelicula> guardarpelicula(Pelicula pelicula) {
		jpa.save(pelicula);
		return listacompleta();
	}

	@Override
	public Pelicula actualizarpelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return jpa.save(pelicula);
	}

	@Override
	public List<Pelicula> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

	@Override
	public Pelicula busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Pelicula busquedaporfecha(Date fecha) {
		// TODO Auto-generated method stub
		return jpa.findByfechaEstreno(fecha);
	}

	@Override
	public Pelicula eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}

}
