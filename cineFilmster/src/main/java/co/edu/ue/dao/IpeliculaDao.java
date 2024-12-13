package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Pelicula;



public interface IpeliculaDao {

	List<Pelicula> guardarpelicula(Pelicula pelicula);
	
	Pelicula actualizarpelicula(Pelicula pelicula);
	
	List<Pelicula> listacompleta();
	
	Pelicula busquedaporId(int id);
	
	Pelicula busquedaporfecha(Date fecha);
	
	Pelicula eliminarporId(int id);
	
	
}
