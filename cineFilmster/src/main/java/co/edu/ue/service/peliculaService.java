package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IpeliculaDao;
import co.edu.ue.entity.Pelicula;
@Service
public class peliculaService implements IpeliculaService {

	@Autowired
	IpeliculaDao dao;

	@Override
	public List<Pelicula> saveMovie(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return dao.guardarpelicula(pelicula);
	}

	@Override
	public Pelicula upmovie(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return dao.actualizarpelicula(pelicula);
	}

	@Override
	public List<Pelicula> ListAll() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Pelicula findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Pelicula findByDate(Date fecha) {
		// TODO Auto-generated method stub
		return dao.busquedaporfecha(fecha);
	}

	@Override
	public Pelicula deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}
	
	
	
	
}
