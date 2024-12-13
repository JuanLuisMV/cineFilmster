package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Pelicula;

public interface IpeliculaService {
	
	List<Pelicula> saveMovie(Pelicula pelicula);
	
	Pelicula upmovie(Pelicula pelicula);
	
	List<Pelicula> ListAll();
	
	Pelicula findById(int id);
	
	Pelicula findByDate(Date fecha);
	
	Pelicula deleteById(int id);
	
}
